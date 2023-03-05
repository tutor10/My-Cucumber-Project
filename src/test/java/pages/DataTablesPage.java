package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class DataTablesPage {

    public DataTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@type='button']")
    public WebElement newButton;

    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='DTE_Field_last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='DTE_Field_position']")
    public WebElement position;

    @FindBy(xpath = "//*[@id='DTE_Field_office']")
    public WebElement office;

    @FindBy(xpath = "//*[@id='DTE_Field_extn']")
    public WebElement extension;

    @FindBy(xpath = "//*[@id='DTE_Field_start_date']")
    public WebElement startDate;

    @FindBy(xpath = "//*[@id='DTE_Field_salary']")
    public WebElement salary;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@id='row_58']/td[2]")
    public WebElement nameColumn;

}
