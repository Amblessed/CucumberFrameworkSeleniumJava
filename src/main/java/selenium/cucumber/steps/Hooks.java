package selenium.cucumber.steps;

//import com.github.mkolisnyk.cucumber.reporting.CucumberFeatureOverview;
import com.github.mkolisnyk.cucumber.reporting.CucumberFeatureOverview;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario)
    {
        System.out.println(">>>>>>STARTING Scenario: " + scenario.getName() + "<<<<<<");
        System.out.println("======BEFORE HOOK METHOD======");
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        System.out.println(scenario.getStatus());
        System.out.println(">>>>>>>>>>>>>>>ENDING Scenario: " + scenario.getName() + "<<<<<<<<<<<<<<<<");
        System.out.println("===============AFTER HOOK METHOD================\n");
    }
}
