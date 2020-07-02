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

    @When("user is on following sub page {string}")
    public void userIsOnTheInternetSubPage(String page) {
        navigateTo.openPage("/" + page);
    }

    @Then("the page title is {string}")
    public void thePageTitleIs(String arg0) {
        Assert.assertEquals("Page title is wrong", arg0, navigateTo.getTitle());
    }

    @Then("the page contains text {string}")
    public void thePageContain(String arg0) {
        Assert.assertTrue("The Page does not contain \"" + arg0 + "\"", navigateTo.contains(arg0));
    }
}
