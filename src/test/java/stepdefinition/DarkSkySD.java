package stepdefinition;
import Utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import runnerTest.webPages.DarkSkyPage;


public class DarkSkySD {

    DarkSkyPage homePage = new DarkSkyPage();

    @Given("^I am on DarkSky Home page$")
    public void verifyHomePageTitle(){
        homePage.getPageTitle();
        Assert.assertEquals(homePage.getPageTitle(), "Dark Sky - Broadway, New York, NY");
    }
    @When("^I click on search button to verify my city$")
     public void verifyTodayOnDarkSkyPage() throws InterruptedException {
        homePage.myCity();
    }
    @And("^I find the highest and lowest temperatures$")
    public void verifyHighestAndLowestTemps() {
        homePage.verifyHighTemp();
        homePage.verifyLowTemp();
//            Assert.assertTrue(homePage.verifyLowTemp());
//            Assert.assertTrue(homePage.verifyHighTemp());
    }
    @Then("^I verify if temp is displayed correctly$")
    public void verifyIfTempIsDisplayedCorrectly() {

        homePage.tempIsDisplayedCorrectly();
    }

}
