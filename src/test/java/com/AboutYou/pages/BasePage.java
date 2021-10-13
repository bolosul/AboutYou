package com.AboutYou.pages;

import com.AboutYou.utilities.BrowserUtils;
import com.AboutYou.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class  BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[id=onetrust-accept-btn-handler]")
    public WebElement acceptCookies;

    @FindBy(css = "[data-test-id='CloseButton']")
    public  WebElement closePopUp;

    @FindBy(css = "[class='topCategoriesContainer--3BVW-']")
    public List<WebElement> allTabs;


    public void navigateTo(String tab) {
            String tabLocator = "[data-test-id=Header_navigation_list_item_"+tab+"]";
            BrowserUtils.waitForPageToLoad(2);

            try {
                BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
                WebElement tabElement = Driver.get().findElement(By.cssSelector(tabLocator));
                new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
            } catch (Exception e) {
                BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
            }
}
}

