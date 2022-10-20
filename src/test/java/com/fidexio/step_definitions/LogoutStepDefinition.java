package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefinition {
    LoginPage loginPage = new LoginPage();


    @When("User able to click on the SalesManager16 user name button")
    public void user_able_to_click_on_the_sales_manager16_user_name_button() {
        loginPage.userDropdown.click();
    }

    @Then("User able to click the Log Out button on on the dropdown")
    public void user_able_to_click_the_log_out_button_on_on_the_dropdown() {
        loginPage.logoutBtn.click();
    }

    @Then("User able to land on the Login page")
    public void user_able_to_land_on_the_login_page() {
        String expectedTitle= "Best solution";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

}
