package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DialogContentProje extends _Parent {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContentProje() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[class='login']")
    private WebElement signIn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    @FindBy(linkText = "Contact us")
    private WebElement contactUs;

    @FindBy(id = "id_contact")
    private WebElement subjectHeading;

    @FindBy(id = "message")
    private WebElement mesaj;

    @FindBy(id = "submitMessage")
    private WebElement submitMessage;

    @FindBy(css = "p[class='alert alert-success']")
    private WebElement trueMessage;

    @FindBy(css = "div[class='alert alert-danger']")
    private WebElement falseMessage;

    @FindBy(css = "*[class*='alert']")
    private WebElement controlMesaj;


    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "signIn":
                myElement = signIn;
                break;

            case "submitLogin":
                myElement = submitLogin;
                break;

            case "submitMessage":
                myElement = submitMessage;
                break;

            case "contactUs":
                myElement = contactUs;
                break;

        }

        clickFunction(myElement);
    }
    public void findElementAndSendKeysFunction(String ElementName, String value) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "email":
                myElement = email;
                break;

            case "password":
                myElement = password;
                break;

            case "subjectHeading":
                myElement = subjectHeading;
                break;

            case "mesaj":
                myElement = mesaj;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findElementAndVerifyContainsText() {
        String msg = "";
        if (controlMesaj.getText().contains("success")) {
            myElement = trueMessage;
            msg = "success";

        } else {
            myElement = falseMessage;
            msg = "error";
        }
        verifyElementContainsText(myElement, msg);



        verifyElementContainsText(myElement, msg);
    }

    public void findElementSelect(String elementName, String value) {

        switch (elementName) {
            case "subjectHeading":
                myElement = subjectHeading;
                break;
        }
        selectMetod(myElement, value);
    }




}
