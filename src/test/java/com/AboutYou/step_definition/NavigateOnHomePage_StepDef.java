package com.AboutYou.step_definition;

import com.AboutYou.pages.DashBoardPage;
import com.AboutYou.utilities.BrowserUtils;
import com.AboutYou.utilities.ConfigurationReader;
import com.AboutYou.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigateOnHomePage_StepDef {

    @Given("customer is on login page")
    public void customer_is_on_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();

        BrowserUtils.waitFor(2);

        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.acceptCookies.click();
        dashBoardPage.closePopUp.click();
        BrowserUtils.waitFor(2);


        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="https://www.aboutyou.de/dein-shop";


        Assert.assertEquals(expectedUrl,actualUrl);
    }


    @When("customer clicks on  desired {string}")
    public void customer_clicks_on_desired(String tab) {

        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.navigateTo(tab);
        BrowserUtils.waitFor(2);
    }
    @Then("user should land on desired {string}")
    public void user_should_land_on_desired(String url ) {

        String actualUrl=Driver.get().getCurrentUrl();
        Assert.assertEquals(url,actualUrl);
        Driver.closeDriver();

    }


}



