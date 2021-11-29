package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookLoginPage {
    public FacebookLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "(//input[@class='form-control'])[1]")
    public WebElement emailBox;

    @FindBy (xpath = "(//input[@class='form-control'])[2]")
    public WebElement passBox;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement clickButton;

    @FindBy (xpath = "(//h2[@class='sec__title font-size-30 text-white'])[1]")
    public WebElement assertion;


}
