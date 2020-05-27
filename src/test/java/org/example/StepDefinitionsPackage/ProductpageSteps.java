package org.example.StepDefinitionsPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Productpage;
import org.example.PageObjectPackage.Sortbyby;

public class ProductpageSteps {
    Productpage productpage = new Productpage();
    Sortbyby sortbyby = new Sortbyby();

    @Given("^user is on result page of loafers with price\\(high to low\\) order$")
    public void user_is_on_result_page_of_loafers_with_price_high_to_low_order() throws Throwable {
        Thread.sleep(2000);
        sortbyby.scrollBy();
    }

    @When("^user clicks on the product - Drorelian$")
    public void user_clicks_on_the_product_Drorelian() throws Throwable {
        Thread.sleep(2000);
        productpage.productMethod();
        Thread.sleep(2000);
        productpage.productAssertion();
    }

    @And("^user clicks on size (\\d+)$")
    public void userClicksOnSize(int arg0) throws InterruptedException {
        Thread.sleep(2000);
        sortbyby.scrollBy();
        Thread.sleep(1000);
        productpage.sizeListMethod();
    }

    @And("^user clicks on add to bag$")
    public void userClicksOnAddToBag() {
        productpage.addtobadMethod();
    }

    @Then("^user should be able to see product - Drorelian 'add to bag' page$")
    public void user_should_be_able_to_see_product_Drorelian_add_to_bag_page() throws Throwable {
        Thread.sleep(3000);
        productpage.screenshotMethod();
    }
}
