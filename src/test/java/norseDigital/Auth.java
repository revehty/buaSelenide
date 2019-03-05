package norseDigital;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class Auth {

//
//    public static void main(String[] args) {
//        Configuration.browser = "chrome";
//        Configuration.holdBrowserOpen = true;
//        open("https://admin.bua.dev.norse.digital/login");
//        AuthorisationPage authorisationPage = new AuthorisationPage();
//        authorisationPage.login("admin" , "publish");
//    }

    @Test
    public void test1() throws InterruptedException {
        Dashboard dashboard = new Dashboard();
        dashboard.locationsMenuItem.click();
        
        Thread.sleep(5000);
    }

//    @Test
//    public void test2() throws InterruptedException {
//        new AuthorisationPage().invalidLogin("admin000" , "publish");
//        ShopBuilder shopBuilder = new ShopBuilder();
//        shopBuilder.selectShopType();
//    }

    @BeforeMethod
    public void setupBrowser() throws InterruptedException{
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "/home/ik/projects/bua/chromedriver/chromedriver");
        System.setProperty("selenide.browser", "chrome");
        String url = "https://admin.bua.dev.norse.digital/login";
        open(url);
        new AuthorisationPage().login("admin", "publish");
        Thread.sleep(5000);
    }

}
