package base;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by user on 08.08.2016.
 */
public class TestBase {

    public static final  String BASE_LINK = "https://mail.ru" ;
protected WebDriver driver;

@BeforeTest
public void setUp(){
        Configuration.holdBrowserOpen = true;
        open(BASE_LINK);



        }


    /*@AfterTest
    public void teardown() {

        driver.close();
    }
*/}
