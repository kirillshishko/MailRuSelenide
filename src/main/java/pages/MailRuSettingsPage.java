package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import helpers.Locators;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 04.09.2016.
 */
public class MailRuSettingsPage {
    public static final By UPLOAD_AVATAR = Locators.get("UploadAvatarLink");
    public static final By SUBMIT_AVATAR = Locators.get("SubmitAvatarLink");
    public static final By SAVE_CHANGES = Locators.get("SaveChangesLink");
    public static final By VERIFY_TEXT_ON_PAGE = Locators.get("VerifyTextOnPageLink");

    public static void uploadAvatar(){
        $(UPLOAD_AVATAR).uploadFile(new File("C:\\111.JPG"));
        $(SUBMIT_AVATAR).click();
        $(SAVE_CHANGES).waitUntil(Condition.visible,10000).click();
    }

    public static SelenideElement isSuccessUploadAvatarDisplaed(){
        return  $(VERIFY_TEXT_ON_PAGE).shouldHave(Condition.text("Артём Рудько  (24 года) "));
    }

    public static  void uploadBlackSquare(){
        $(UPLOAD_AVATAR).uploadFile(new File("C:\\11.JPG"));
        $(SUBMIT_AVATAR).click();
        $(SAVE_CHANGES).waitUntil(Condition.visible,10000).click();
    }
}
