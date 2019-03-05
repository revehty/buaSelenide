package norseDigital;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard {
    public SelenideElement locationsMenuItem = $("sc-cMljjf faFDXj");

    public static void selectLocations(){
        $("sc-gipzik gdfrQl").click();
    }
}
