package pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;


public class MailRuLoginPageStatic {


    private static final By LOGIN_FIELD = Locators.get("LoginField");

    private static final By PASSWORD_FIELD = Locators.get("PasswordField");

    private static final By DOMAIN_FIELD = Locators.get("DomainField");

    private static final By AUTH_BUTTON = Locators.get("AuthButton");


    public static void setLogin(WebDriver driver, String login) {

        SelenideElement loginField =$(LOGIN_FIELD);
        loginField.setValue(login);


    }

    public static void setPassword(WebDriver driver, String password) {

        SelenideElement passwordField =$(PASSWORD_FIELD);
        passwordField.setValue(password);

    }

    public static void chooseDomain(WebDriver driver, String domain) {

    SelenideElement select = $(DOMAIN_FIELD);
        select.selectOptionByValue(domain);


    }

    public static void authButtonClick(WebDriver driver) {
        SelenideElement authButton = $(AUTH_BUTTON);
        authButton.click();

    }


}
