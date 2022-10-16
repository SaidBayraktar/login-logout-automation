package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @When("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user should be able to type valid credentials")
    public void user_should_be_able_to_type_valid_credentials() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("userName"));
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("passWord"));
        loginPage.logInButton.click();
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        String expectedTitle = "Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

}
