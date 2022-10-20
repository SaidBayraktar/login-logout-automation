package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy (id = "login")
    public WebElement userName;

    @FindBy (id = "password")
    public WebElement passWord;


    @FindBy (xpath = "//button[@type=\"submit\"]")
    public WebElement logInButton;

    @FindBy (className = "alert")
    public WebElement wrongUserOrPassWordBtn;

    @FindBy(xpath = "//span[@class=\"oe_topbar_name\"]")
    public WebElement userDropdown;

    @FindBy (xpath="//a[@data-menu=\"logout\"]")
    public WebElement logoutBtn;



}
