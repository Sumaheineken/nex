package com.tui.HAT.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Nex extends BasePage {

    public Nex(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//div[@class='form-group floating-label'])[1]/input")
    private WebElement sername;

    @FindBy(xpath = "(//div[@class='form-group floating-label'])[2]/input")
    private WebElement pasw;
    @FindBy(xpath = "//button[@id='log-btn']")
    private WebElement loginbutton;
    @FindBy(xpath = "//div[@class='user-photo-newui']")
    private WebElement verify;

    @FindBy(xpath = "//a[@id='hr']")
    private WebElement clickstaffadd;

    @FindBy(xpath = "//li[@id='link_addStaff']")
    private WebElement clickadddetails;
    @FindBy(xpath = "//input[@id='staffFullName']")
    private WebElement nameStaff;
    @FindBy(xpath = "//input[@id='dob']")
    private WebElement inpdob;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[4]/a")
    private WebElement datedob;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='salaryStartDate']")
    private WebElement salarycick;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a")
    private WebElement dateclick;
    @FindBy(xpath = "//button[@id='submitButton']")
    private WebElement clicksave;

    @FindBy(xpath = "//li[@id='link_editStaff']")
    private WebElement editsts;

    @FindBy(xpath = "//input[@id='staffRegisterNoOrName']")
    private WebElement edituser;

    @FindBy(xpath = "//button[@id='staffSearch']")
    private WebElement cickSearch;

    @FindBy(xpath = "//input[@id='joinDate']")
    private WebElement joindate;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")
    private WebElement clickjoin;
    @FindBy(xpath = "//*[@id='itemrow']/tbody/tr/td[3]")
    private WebElement veriitem;


    public void login(String username, String psw) throws InterruptedException {
sername.sendKeys(username);
pasw.sendKeys(psw);
loginbutton.click();
        Thread.sleep(10000);
waitForElementPresent(verify);
    }

    public void save() {
        waitForElementClickable(clickstaffadd);
clickstaffadd.click();
waitForElementClickable(clickadddetails);
clickadddetails.click();
waitForElementPresent(nameStaff);
nameStaff.sendKeys("saikarthikeya");
waitForElementClickable(inpdob);
inpdob.click();
waitForElementClickable(datedob);
datedob.click();
        waitForElementPresent(joindate);
        joindate.click();
        waitForElementClickable(clickjoin);
        clickjoin.click();
waitForElementPresent(email);
email.sendKeys("saikarthikeya@gmail.com");
waitForElementClickable(salarycick);
salarycick.click();
waitForElementClickable(dateclick);
dateclick.click();

clicksave.click();
    }

    public void eave() {
        waitForElementClickable(editsts);
        editsts.click();
        waitForElementPresent(edituser);
        edituser.sendKeys("saikarthikeya");
        waitForElementClickable(cickSearch);
cickSearch.click();
waitForElementPresent(veriitem);
    }

}