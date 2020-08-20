package runnerTest.webPages;

import org.openqa.selenium.By;


public class LoginPage extends ElementUtil {

    private By skyAPI = By.xpath("//a[contains(text(),'Dark Sky API')]");
    private By longin = By.xpath("//a[@class='button']");
    private  By errorMessage = By.className("error");
    private By email = By.id("email");
    private By password = By.id("password");
    private By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    public void clickOnLoginPage() {
        webAction(skyAPI).click();
    }
    public void clickOnLogBtn(){
         webAction(longin).click();
}
    public void enterEmail(String enterEmail) {

        sendValue(email, enterEmail);
    }

    public void enterPassword(String enterPassword) {

        sendValue(password, enterPassword);
    }

    public void clickOnLogin() {

    clickOn(loginButton);

    }

    public String getTextElement() {

        return getTextFromElement(errorMessage);
    }

}

