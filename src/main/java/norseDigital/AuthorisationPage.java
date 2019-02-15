package norseDigital;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthorisationPage {

    private SelenideElement usernameLocator = $("[name= 'username']");
    private SelenideElement passwordLocator = $("[name= 'password']");
    private SelenideElement loginButton = $("[type='submit']");
    private int maxWaitTime  = 20000;

    private void setUsername (String username){
        usernameLocator.waitUntil(Condition.visible, maxWaitTime).setValue(username);
    }

    private void setUsername (){
        usernameLocator.waitUntil(Condition.visible, maxWaitTime).setValue("");
    }



    private void setPassword (String password){
        passwordLocator.waitUntil(Condition.visible,maxWaitTime).setValue(password);
    }

    private void clickOnLoginButton(){
        loginButton.click();
    }

    public void login(String username , String password ){
        setUsername(username);
        setPassword(password);
        clickOnLoginButton();
    }

    public void invalidLogin(String username , String password){
        setUsername(username);
        setPassword(password);
        clickOnLoginButton();
        $(".sc-gqjmRU.kIYukz").waitUntil(Condition.visible,20000).shouldHave(Condition.text("Bad credentials"));

    }

}
