package com.AboutYou.step_definition;

import com.AboutYou.pages.DashBoardPage;
import com.AboutYou.utilities.BrowserUtils;
import com.AboutYou.utilities.ConfigurationReader;
import com.AboutYou.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationOnHomePage_StepDef {

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.acceptCookies.click();
        BrowserUtils.waitFor(3);
    }

    @When("user clicks on {string} tab and {string} module")
    public void user_clicks_on_tab_and_module(String tab, String module) {


        DashBoardPage dashBoardPage = new DashBoardPage();

        dashBoardPage.navigateToModule(tab,module);
    }
    @Then("user should land on desired page")
    public void user_should_land_on_desired_page() {

     String expectedTitle="Board - ABOUT YOU";
     String acutalTitle=Driver.get().getTitle();

        Assert.assertEquals(expectedTitle,acutalTitle);

    }

}
