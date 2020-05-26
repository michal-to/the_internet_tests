package starter.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;


public class SmokeTestStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;


    @When("user is on The Internet home page")
    public void userIsOnTheInternetHomePage() {
        navigateTo.openHomePage();
    }

    @Then("the page title is {string}")
    public void thePageTitleIs(String arg0) {
        Assert.assertEquals("Page title is wrong", arg0, navigateTo.getTitle());
    }
}
