package StepDefinitions;

import Pages.DialogContentProje;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContacUs {

    DialogContentProje dialogContent = new DialogContentProje();

    @And("^Navigate to Contac us page$")
    public void navigateToContacUsPage() {
        dialogContent.findElementAndClickFunction("contactUs");
    }

    @When("^User select a \"([^\"]*)\" enter a \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userSelectAEnterAAnd(String subjectHeading, String Message, String email)  {
        dialogContent.findElementSelect("subjectHeading",subjectHeading);
        dialogContent.findElementAndSendKeysFunction("mesaj",Message);
        dialogContent.findElementAndSendKeysFunction("email",email);

        dialogContent.findElementAndClickFunction("submitMessage");

    }

    @Then("^Success error message should be displayed$")
    public void successErrorMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText();
    }
}
