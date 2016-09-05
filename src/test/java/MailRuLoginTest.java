import base.TestBase;
import org.testng.annotations.Test;
import pages.MailRuLoginPageStatic;
import pages.MailRuMainPage;
import pages.MailRuSettingsPage;

/**
 * Created by user on 18.08.2016.
 */
public class MailRuLoginTest  extends TestBase{

    @Test
    public  void mailRuStaticTest() throws InterruptedException {
        String domain = "bk.ru";
        String login = "strong.zubovich";
        String password = "ZXCvbn123!";
        String myEmail = "kirill.shishko.9292@mail.ru";
        String myPassword = "jerk14__";
        String themeName = "Theme";
        String  text = "Some text...";


        MailRuLoginPageStatic.setLogin(driver,login );
        MailRuLoginPageStatic.setPassword(driver,password);
        MailRuLoginPageStatic.chooseDomain(driver,domain);
        MailRuLoginPageStatic.authButtonClick(driver);


        MailRuMainPage.writeButtonButton(driver);
        MailRuMainPage.setEmail(driver,myEmail);
        MailRuMainPage.setTheme(driver,themeName);
        MailRuMainPage.setTextEmail(driver,text);


        MailRuSettingsPage.uploadAvatar();



        /*Assert.assertTrue(MailRuEmailPageStatic.isAuthSucced(driver));
        MailRuEmailPageStatic.chooseAllLetters(driver);
        MailRuEmailPageStatic.showAllLetters(driver);
*/
    }
}
