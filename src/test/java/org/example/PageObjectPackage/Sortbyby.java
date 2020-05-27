package org.example.PageObjectPackage;

import gherkin.lexer.Th;
import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Sortbyby extends DriverFactory {

    @FindBy(xpath = "//select[@id='ProductLandingSortOptionsDropdown']")
    WebElement relevanceBox;
    public void relevanceSelectClass(){
        Select sel = new Select(relevanceBox);
        sel.selectByValue("price-desc");
    }
    public void scrollBy() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scrollBy(0,300);");
    }

}
