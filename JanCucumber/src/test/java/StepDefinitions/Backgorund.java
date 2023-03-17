package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Backgorund {

    @Before
    public void beforeScenario(){
        System.out.println("THis is Before Scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("This After Scenario");
    }

    @Given("user searches an Item")
    public void user_searches_an_item() {
        System.out.println("User is searching an item");
    }

    @When("the user click on shorlist")
    public void the_user_click_on_shorlist() {
        System.out.println("User will shortlist and item");
    }

    @Then("the item should be in shorlisted")
    public void the_item_should_be_in_shorlisted() {
        System.out.println("Item is presnt in shortlist folder");
    }


    @Given("user is logged in")
    public void user_is_logged_in() {
        System.out.println("User is logged in");
    }
    @When("the user goes to cart and clicks payment and checkout")
    public void the_user_goes_to_cart_and_clicks_payment_and_checkout() {
        System.out.println("User clicks on payment");
    }
    @Then("the user must redirect to payments page")
    public void the_user_must_redirect_to_payments_page() {
        System.out.println("User is in payments page");
    }

}
