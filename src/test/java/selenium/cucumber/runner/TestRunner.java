package selenium.cucumber.runner;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 3, detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        /*excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },*/
        outputFolder = "target")
@CucumberOptions(
        features = "Features", glue = "selenium.cucumber.steps",
        tags = "@facebook", strict = true,
        plugin = {"pretty","html:target/cucumber-html-report",
                "usage:target/cucumber-usage.json",
                "rerun:target/rerun.txt","junit:target/cucumber-results.xml",
                "json:target/cucumber.json"})


//This is used when we want to use junit as the test engine framework

public class TestRunner {
}



//This is used when we want to use testng as the test engine framework
/*public class TestRunner extends AbstractTestNGCucumberTests {
}*/
