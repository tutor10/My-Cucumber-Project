package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginpage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class BlueRentalLoginStepDefinitions {

    BlueRentalLoginpage blueRentalLoginpage = new BlueRentalLoginpage();
    BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();
//   1.GET DATA AS LIST OF STRING
    @Given("user enters customer_email and customer_password")
    public void user_enters_customer_email_and_customer_password(DataTable credentials) {
//      List<String> customerData=credentials.row(1);//row index starts at 0
//        System.out.println(customerData.get(0));
//        System.out.println(customerData.get(1));
//        System.out.println(credentials.row(1).get(0));//2nd row 1st column
//        System.out.println(credentials.row(1).get(1));//2nd row 2nd column

//        blueRentalLoginpage.username.sendKeys(customerData.get(0));
//        blueRentalLoginpage.password.sendKeys(customerData.get(1));
//        blueRentalLoginpage.loginButton.click();
        //       ReusableMethods.waitFor(2);

//      2. GET DATA AS <LIST<MAP<STRING,STRING>>
        List<Map<String, String>> customerData = credentials.asMaps(String.class, String.class);
        System.out.println(customerData);
        for (Map<String, String> each : customerData) {
            blueRentalLoginpage.username.sendKeys(each.get("username"));
            blueRentalLoginpage.password.sendKeys(each.get("password"));
            blueRentalLoginpage.loginButton.click();

            ReusableMethods.waitFor(2);

        }
    }

    @Then("verify the application login is successful")
    public void verify_the_application_login_is_successful() {
        Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());


    }

    @Then("verify the next page url contains login keyword")
    public void verify_the_next_page_url_contains_login_keyword() {
        Assert.assertTrue(false);
        //BELOW ASSERTION FAILS
       // Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));


    }
}