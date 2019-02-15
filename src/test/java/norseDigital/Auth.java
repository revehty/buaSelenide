package norseDigital;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class Auth {
    String url = "https://admin.bua.dev.norse.digital/login";
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
        open(url);
        new AuthorisationPage().login("admin" , "publish");
        close();


//        Thread.sleep(5000);
    }

    @Test
    public void test2() throws InterruptedException {
        open(url);
        new AuthorisationPage().invalidLogin("admin000" , "publish");
        ShopBuilder shopBuilder = new ShopBuilder();
        shopBuilder.selectShopType();
    }

    @BeforeMethod
    public void setupBrowser(){
        Configuration.browser = "chrome";
    }
}
