package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    Faker faker= new Faker();

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


    // --------------------

    @Given("User able to go to the homepage")
    public void user_able_to_go_to_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User as a SalesManager able to write valid credentials in the username and password box.")
    public void user_as_a_sales_manager_able_to_write_valid_credentials_in_the_username_and_password_box() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("smanager"));
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("spmanager"));
    }

    @Then("User able to click on the log in button")
    public void user_able_to_click_on_the_log_in_button() {
        loginPage.logInButton.click();
    }


    @When("User as a PosManager able to write valid credentials in the username and password box.")
    public void user_as_a_pos_manager_able_to_write_valid_credentials_in_the_username_and_password_box() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("pmanager"));
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("ppmanager"));
    }


    @When("User able to type invalid credentials")
    public void user_able_to_type_invalid_credentials() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("invUserName"));
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("invPassWord"));
    }


    @Then("{string} should be *displayed*")
    public void should_be_displayed(String string) {
        Assert.assertEquals(string, loginPage.wrongUserOrPassWordBtn.getText());
    }


    @When("User leaves the userName and password empty")
    public void user_leaves_the_user_name_and_password_empty() {
        System.out.println("no user input");
    }


    @When("User able to type any password on the password input")
    public void user_able_to_type_any_password_on_the_password_input() {
       loginPage.passWord.sendKeys(faker.name().firstName());

    }



    @Then("User should enter the ENTER button on the keyword.")
    public void user_should_enter_the_button_on_the_keyword(String string) {
        loginPage.passWord.clear();
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("ppmanager"+Keys.ENTER));

    }

    @Then("User able to login to the main page")
    public void user_able_to_login_to_the_main_page() {
        Assert.assertEquals(Driver.getDriver().getTitle(),ConfigurationReader.getProperty("expHomeTitle"));

    }


    @And("{string} should be displayed.")
    public void shouldBeDisplayed(String arg0) {


    }

    @When("User able to locate\\/see the {string} link")
    public void userAbleToLocateSeeTheLink(String arg0) {
    }

}
