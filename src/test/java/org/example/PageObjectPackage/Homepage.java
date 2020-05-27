package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {

    @FindBy(xpath = "//button[@id='regular-menu-ukenukmen']//span[@class='c-navigation--primary__title-button--text']")
    WebElement men;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[7]/header[1]/div[1]/div[3]/nav[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
    WebElement loafers;

    @FindBy(xpath = "//p[@class='c-product-landing-header__subhead']")
    WebElement loafersCaption;

    public void menMouseHover(){
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
}

    public void loaferSubelement(){
        Actions action = new Actions(driver);
    action.moveToElement(loafers).click().perform();
}
    public void loafersAssertion() throws InterruptedException {
        Thread.sleep(2000);
        String actualLoafers = loafersCaption.getText();
        Assert.assertThat(actualLoafers, Matchers.containsString("loafers "));
        if (actualLoafers.contains(loafers.getText())){
            System.out.println("Assertion is passed!");
        }else {
            System.out.println("Assertion is failed!");
        }
    }

}
