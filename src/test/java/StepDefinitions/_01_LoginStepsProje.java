package StepDefinitions;

import Pages.DialogContentProje;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class _01_LoginStepsProje {

    WebDriver driver;

    @Given("^Navigate to automationpractice$")
    public void navigate_to_automationpractice() {
        driver = Driver.getDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button()  {

        DialogContentProje dialogContent = new DialogContentProje();

        dialogContent.findElementAndClickFunction("signIn");

        dialogContent.findElementAndSendKeysFunction("email","adkl@gmail.com");

        dialogContent.findElementAndSendKeysFunction("password","ad12345678");

        dialogContent.findElementAndClickFunction("submitLogin");


    }


}
