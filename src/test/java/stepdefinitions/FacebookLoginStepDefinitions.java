package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookLoginPage;
import utilities.Driver;

import javax.swing.*;
import java.util.Set;

public class FacebookLoginStepDefinitions {

    FacebookLoginPage facebookLoginPage = new FacebookLoginPage();

    @Given("user is on the facebook login page")
    public void user_is_on_the_facebook_login_page() {
        Driver.getDriver().get("https://www.phptravels.net/login");

    }

    @Given("user enters valid username {string}")
    public void user_enters_valid_username(String string) {
        facebookLoginPage.emailBox.sendKeys(string);
    }

    @Given("user enters valid password {string}")
    public void user_enters_valid_password(String string) {
        facebookLoginPage.passBox.sendKeys(string+Keys.ENTER);
    }

//    @Given("user clicks login button")
//    public void user_clicks_login_button() {
//        facebookLoginPage.clickButton.click();
//    }

    @Then("verify login is successfull")
    public void verify_login_is_successfull() {
        String result = facebookLoginPage.assertion.getText();
        System.out.println(result);

        Assert.assertTrue(result.contains("Welcome Back"));
    }

}
