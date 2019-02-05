package login.Cen04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class LoginPageCen04 {

    private WebDriver driver;

    public LoginPageCen04(WebDriver driver){
        this.driver = driver;
    }

    //Element locators
    private By esqueceu = By.cssSelector(".login-lostPwd.metaFont");
    private By email = By.cssSelector("[name='user_login']");
    private By acessar = By.cssSelector(".login-submit input:nth-child(1)");
    private By mensagemError = By.cssSelector(".login-msg");

    //Interactions

    public LoginPageCen04 clickOnEsqueceu(){
        driver.findElement(esqueceu).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return this;
    }

    public LoginPageCen04 pressEnter(){
        driver.findElement(email).click();
        driver.findElement(email).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return this;
    }

    public String getMessageError(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.findElement(mensagemError).getText();
    }
}