package com.AboutYou.pages;

import com.AboutYou.utilities.Driver;
import com.AboutYou.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class  BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void navigateToModule(String tab) {
        String tabLocator = "[data-test-id=Header_navigation_list_item_"+tab+"]";
        BrowserUtils.waitFor(2);

}

}

