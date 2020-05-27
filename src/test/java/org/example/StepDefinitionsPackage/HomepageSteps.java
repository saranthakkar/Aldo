package org.example.StepDefinitionsPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;

public class HomepageSteps {
    Homepage homepage = new Homepage();

    @Given("^user is on home page of aldo$")
    public void user_is_on_home_page_of_aldo() throws Throwable {
    }

    @When("^user brings mouse cursor onto men and clicks on sub element - loafers$")
    public void user_brings_mouse_cursor_onto_men_and_clicks_on_sub_element_loafers() throws Throwable {
        Thread.sleep(2000);
    homepage.menMouseHover();
    Thread.sleep(2000);
    homepage.loaferSubelement();
    }

    @Then("^user should be able to see result page$")
    public void user_should_be_able_to_see_result_page() throws Throwable {
        Thread.sleep(2000);
    homepage.loafersAssertion();
    }
}
