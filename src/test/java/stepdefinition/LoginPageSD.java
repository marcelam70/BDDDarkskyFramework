package stepdefinition;

import Utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.LoginPage;

public class LoginPageSD {

    private LoginPage loginPage = new LoginPage();

    @Given("^Given I am on the darksky Register page$")
    public void iAmOnLoginPage(){
    loginPage.clickOnLoginPage();
    loginPage.clickOnLogBtn();
    }
    @When("^I enter (.+) into (email|password) text fields on login page$")
    public void enterDataUserAndPAss(String anyText, String textField){

        switch (textField){
            case "email":
                loginPage.enterEmail(anyText);
                break;
            case "password":
                loginPage.enterPassword(anyText);
                break;
        }
    }

    @And("^I click on login button$")
    public void verifyLogin(){
        loginPage.clickOnLogin();


    }

    @Then("^I verify error message “Username and password do not match”$")
    public void verifyErrorMessage(){
        Assert.assertEquals(loginPage.getTextElement(), "Username and password do not match");

    }
}
