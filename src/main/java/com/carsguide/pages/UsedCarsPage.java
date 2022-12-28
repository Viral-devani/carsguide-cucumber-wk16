package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsedCarsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public UsedCarsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']//option")
    List<WebElement> makelist;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']//option")
    List<WebElement> modelList;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']//option")
    List<WebElement> locationList;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']//option")
    List<WebElement> priceMax;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCar;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'car_dropdowns_c1']//a")
    WebElement makeResult;
    public void selectCarModel(String carlist) throws InterruptedException {

        //selectByVisibleTextFromDropDown(makelist,carlist);
        selectMenu(makelist, carlist);
        log.info("Select Car Make : " + carlist);
    }
    public void selectModel(String model) throws InterruptedException {
        selectMenu(modelList, model);
        log.info("Select Model : " + model);
    }
    public void selectLocation(String location) throws InterruptedException {
        selectMenu(locationList, location);
        log.info("Selection Location : " + location);
    }
    public void selectPrice(String price) throws InterruptedException {
        selectMenu(priceMax, price);
        log.info("Select Price : " +price);
    }
}
