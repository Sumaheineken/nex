package com.tui.HAT.stepDefinitions;

import com.tui.HAT.cucumberUtil.TestContext;
import com.tui.HAT.cucumberUtil.TestContextManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tuispain extends TestContextManager {

    public Tuispain(TestContext context) {
        super(context);
    }

    @Given("^Login to Facebook(.*),(.*)$")
    public void login_as_LDR_Vendor(String userName, String psw) {
        // loginPage.login(userName, psw);
        loginPage.addCookies();

    }

    @Given("^I login to nextgen(.*) and (.*)$")
    public void addCookie(String usernmae,String psw) throws InterruptedException {
      nex.login(usernmae, psw);
    }
    @When("^I click on staffad and save details$")
    public void childWindow()
    {
       nex.save();

    }
    @When("^I click on edit and search for add$")
    public void search()
    {
        nex.eave();

    }

}


