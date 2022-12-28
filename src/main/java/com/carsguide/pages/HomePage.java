package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[text()='buy + sell']")
    WebElement buyAndSell;
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Buy']//following::ul[1]/li/a")
    //@FindBy(xpath = "//p[@class='child-title']//following::ul[1]//li/a[contains(text(),'Search')]")
    List<WebElement> buyAndSellList;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Used']")
    WebElement usedCar;

    public void iMouseHoverOnBuySellTab() {
        mouseHoverToElement(buyAndSell);
        log.info("mouse hover on buy and sell : " + buyAndSell.toString());
    }
    public void clickOnSearchCarsLink(String menu) throws InterruptedException {
        selectMenu(buyAndSellList, menu);
        log.info("click on search cars : " + menu);
    }

}
