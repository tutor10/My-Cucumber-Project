package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class DataTablesStepDefinitions {
DataTablesPage dataTablesPage =new DataTablesPage();

    @Given("user is on {string} page")
    public void userIsOnPage(String string) {
        Driver.getDriver().get(string);
        ReusableMethods.waitFor(2);
    }
    @Given("user click on the new button")
    public void user_click_on_the_new_button() {
        dataTablesPage.newButton.click();
        ReusableMethods.waitFor(2);

    }
    @Given("user enter the first name {string}")
    public void user_enter_the_first_name(String string) {
        dataTablesPage.firstName.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @Given("user enter the last name{string}")
    public void user_enter_the_last_name(String string) {
        dataTablesPage.lastName.sendKeys(string);

    }
    @Given("user enter the position {string}")
    public void user_enter_the_position(String string) {
        dataTablesPage.position.sendKeys(string);

    }
    @Given("user enter the office {string}")
    public void user_enter_the_office(String string) {
        dataTablesPage.office.sendKeys(string);

    }
    @Given("user enter the extension {string}")
    public void user_enter_the_extension(String string) {
        dataTablesPage.extension.sendKeys(string);

    }
    @Given("user enter the start date {string}")
    public void user_enter_the_start_date(String string) {
        dataTablesPage.startDate.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @Given("user enter the salary {string}")
    public void user_enter_the_salary(String string) {
        dataTablesPage.salary.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @Given("click on create button")
    public void click_on_create_button() {
        dataTablesPage.createButton.click();
        ReusableMethods.waitFor(1);
    }
    @Given("search for the first name {string}")
    public void search_for_the_first_name(String string) {
        dataTablesPage.searchBox.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @Then("verify the name field contains the first name {string}")
    public void verify_the_name_field_contains_the_first_name(String string) {
     Assert.assertTrue(dataTablesPage.nameColumn.getText().contains(string));
        //Assert.assertTrue(dataTablesPage.nameColumn.isDisplayed());
        ReusableMethods.waitFor(1);
    }



    }
