package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CarDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(className = "dealerListing--name")
    List<WebElement> dealersName;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextbuttoncontinue;

public void verifyDealersName(String menu){
    //System.out.println("INPUT NAME "+menu);


while (nextbuttoncontinue.isDisplayed() == true){
    for(WebElement name :dealersName){
        //System.out.println("LOOPSOUT "+name.getText());
        if (name.getText().equalsIgnoreCase(menu)){
            //System.out.println("MATCH-SOUT "+name.getText());
            Assert.assertTrue(true);
            return;
        }
        else {
            Assert.assertFalse(false);
        }
    }
    nextbuttoncontinue.click();
}
 }
}
