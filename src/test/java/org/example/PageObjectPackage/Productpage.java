package org.example.PageObjectPackage;

import cucumber.api.java.it.Ma;
import org.apache.commons.io.FileUtils;
import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Productpage extends DriverFactory {
    @FindBy(xpath = "//picture[@class='c-product-tile__content u-transition-delay-2 c-picture c-picture--is-loaded']//img")
    WebElement productDrorelian;
    @FindBy(xpath = "//header[@class='c-buy-module--has-product-features c-buy-module']//span[2]")
    WebElement productDescription;
    @FindBy(xpath = "//button[@class='u-btn u-btn--regular c-purchase-buttons__button c-purchase-buttons__button--add-to-bag u-btn--has-check-icon']//span[@class='u-btn__content']")
    WebElement addtobagButton;
    public void productMethod(){
        productDrorelian.click();
    }
    public void productAssertion(){
        String actual = productDescription.getText();
        Assert.assertThat(actual, Matchers.containsString("Drorelian"));
    }

    public void sizeListMethod(){
        List<WebElement> options = driver.findElements(By.cssSelector(".c-product-option-list__list-item "));
        for (WebElement option : options){
            System.out.println(option.getText());
            if (option.getText().contains("9")){
                option.click();
                break;
            }
        }
    }
    public void addtobadMethod(){
        addtobagButton.click();
    }
    public void screenshotMethod() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfolder = new File("D:\\Desktop\\AldoScreenshot.png");
        FileUtils.copyFile(sourcefile,destinationfolder);
    }

}
