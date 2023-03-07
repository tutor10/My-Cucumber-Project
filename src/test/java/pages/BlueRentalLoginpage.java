package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalLoginpage {
    public BlueRentalLoginpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "formBasicEmail")
    public WebElement username;

    @FindBy(id="formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;



}
