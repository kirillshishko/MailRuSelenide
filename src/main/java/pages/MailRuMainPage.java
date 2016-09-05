package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 24.08.2016.
 */
public class MailRuMainPage {

    private static final By WRITE_BUTTON = Locators.get("WriteButton");
    private static final By WHOM_FIELD = Locators.get("WhomField");
    private  static  final  By THEME_FIELD = Locators.get("ThemeField");
    private  static  final  By WRITE_FIELD_FRAME = Locators.get("WriteFrame");
    private  static  final  By WRITE_FIELD = Locators.get("WriteField");
    public static final By PRIVATE_OPTION = Locators.get("PrivateOptionLink");
    public static final By SETTINGS = Locators.get("SettingLink");



    public static  void writeButtonButton(WebDriver driver) throws InterruptedException {

        Thread.sleep(5000);
         $(WRITE_BUTTON).click();
    }

    public static void setEmail(WebDriver driver,String email){

        $(WHOM_FIELD).setValue(email);



    }
    public  static void setTheme(WebDriver driver,String themeName ){


        $(THEME_FIELD).setValue(themeName);
    }

    public  static  void  setTextEmail(WebDriver driver, String  textEmail){


        $(WRITE_FIELD).setValue(textEmail);
    }

    public static void goToSettingsPage(){
        $(PRIVATE_OPTION).click();
        $(SETTINGS).click();
    }
}
