package login.Cen03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class LoginPageCen03 {

    private WebDriver driver;

    public LoginPageCen03(WebDriver driver){
        this.driver = driver;
    }

    //Element locators
    private By usuario = By.cssSelector(".login-username label+input");
    private By senha = By.cssSelector(".login-password label+input");
    private By acessar = By.cssSelector(".login-submit input:nth-child(1)");
    private By mensagem = By.cssSelector("p.login-msg");

    //Interactions

    public LoginPageCen03 fillUsuario(String a){
        driver.findElement(usuario).click();
        driver.findElement(usuario).sendKeys(a);
        return this;
    }

    public LoginPageCen03 fillSenha(String a){
        driver.findElement(senha).click();
        driver.findElement(senha).sendKeys(a);
        return this;
    }
    public LoginPageCen03 clickOnAcessar(){
        driver.findElement(acessar).click();
        return this;
    }

    public String getMessage(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.findElement(mensagem).getText();
    }
}