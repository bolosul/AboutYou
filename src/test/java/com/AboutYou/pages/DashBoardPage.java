package com.AboutYou.pages;

import com.AboutYou.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage{

    public DashBoardPage() {
        PageFactory.initElements(Driver.get(), this);
    }



}
