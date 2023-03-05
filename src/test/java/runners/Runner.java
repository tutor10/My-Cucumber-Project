package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/default_cucumber_report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        },
        features = "./src/test/resources/features",//path od features folder
        glue = "stepdefinitions",//path of the step definitions folder
        tags = "@date_tables",
        dryRun = false
)
public class Runner {
}
/*
Runner class is used to run the feature files
@RunWith : makes this class runnable
@CucumberOptions :
    1. features : path of the features folder
    2. glue : path of the step definitions folder
 */
/*
 features = "./src/test/resources/features",//path od features folder
 glue = "stepdefinitions",//path of the step definitions folder
 dryRun = false // IF dryRun=tru.RUN DRY.JUST GIVE ME THE MISSING STEP DEFINITIONS.DON'T RUN THE CASES
 dryRun=false when we are doing test execution.dryRun=true hen we are generation missing step definitions
 */