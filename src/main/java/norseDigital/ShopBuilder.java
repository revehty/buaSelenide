package norseDigital;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class ShopBuilder {



    public static void selectShopType(){
        $("#franchise").click();
    }

    private static void setNavn(String name){
        $("[placeholder='Navn']").setValue(name);
    }

    public static void main(String[] args) throws InterruptedException {
        Configuration.browser = "chrome";
        open( "https://admin.bua.dev.norse.digital/login");
        new AuthorisationPage().login("admin", "publish");
        Thread.sleep(5000);
        open("https://admin.bua.dev.norse.digital/locations/create/1");
        Thread.sleep(5000);
        setNavn("dsdsds");
        Thread.sleep(5000);
    }
}
