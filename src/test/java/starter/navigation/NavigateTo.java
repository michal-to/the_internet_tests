package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    TheInternetHomePage theInternetHomePage;

    @Step("Open the Internet home page")
    public void openHomePage() {
        theInternetHomePage.open();
    }

    public void openPage(String page) {
        theInternetHomePage.openAt(page);
    }

    public String getTitle() {
        return theInternetHomePage.getTitle();
    }

    public boolean contains(String text) {
        return theInternetHomePage.containsText(text);
    }

}
