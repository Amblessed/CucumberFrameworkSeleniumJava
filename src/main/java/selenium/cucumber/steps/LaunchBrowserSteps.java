package selenium.cucumber.steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserSteps {

    private WebDriver driver;
    String searchTerm = "";

    @Given("The launches the Chrome Browser and goes to {string}")
    public void the_launches_the_Chrome_Browser_and_goes_to(String string)
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(string);
    }

    @When("The user enter the search term {string}")
    public void the_user_enter_the_search_term(String string)
    {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(string);
        search.sendKeys(Keys.ESCAPE);
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        searchTerm = string;
    }

    @When("Clicks the search button")
    public void clicks_the_search_button()
    {
        WebElement submit = driver.findElement(By.name("btnK"));
        submit.click();
    }

    @Then("Only results related to {string} are displayed")
    public void only_results_related_to_are_displayed(String string)
    {
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains(searchTerm));
        driver.quit();
    }

}
