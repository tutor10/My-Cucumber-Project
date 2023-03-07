package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.sql.SQLOutput;

public class Hooks {
    // Hooks is used to run before and after each SCENARIO or SCENARIO OUTLINE
    @Before
    public void setUpScenario() {
        System.out.println("This is before method");
    }
    @After
    public void tearDownScenario(Scenario scenario) {
        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName() + " ");
            Driver.closeDriver();
        }
    }
    // THIS BEFORE HOOKS ONLY RUNS FOR @smoke_test TAGGED SCENARIOS
    // @Before(value = "@smoke_test")
    @Before("@smoke_tests")
    public void setUpSmokeScenario() {
        System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }

    //    @After("@smoke or @regression")
    // THIS AFTER HOOKS ONLY RUNS FOR @smoke_test TAGGED SCENARIOS
    @After("@smoke_tests")
    public void tearDownSmokeScenarios(){
        System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }
//    I can run hooks for specific tags. In this example, we run for only @smoke or @regression

    //    runs after each Scenario adn if a scenario fails, captured and attached the screenshot i out html file

}
