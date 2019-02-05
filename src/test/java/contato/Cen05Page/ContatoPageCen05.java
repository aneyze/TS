package contato.Cen05Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ContatoPageCen05 {

    private WebDriver driver;

    public ContatoPageCen05(WebDriver driver){
        this.driver = driver;
    }

    //Element locators
    private By telefone = By.cssSelector(".telefone input");
    private By assunto = By.cssSelector(".your-subject input");
    private By sua_mensagem = By.cssSelector(".your-message textarea");
    private By enviar = By.cssSelector(".wpcf7-form-control.wpcf7-submit");
    private By erro_generico = By.cssSelector(".wpcf7-validation-errors");
    private By erro_nome_obg = By.cssSelector(".your-name .wpcf7-not-valid-tip");
    private By erro_email_obg = By.cssSelector(".your-email .wpcf7-not-valid-tip");

    //Interactions

    public ContatoPageCen05 fillTelefone(String a){
        driver.findElement(telefone).click();
        driver.findElement(telefone).sendKeys(a);
        return this;
    }

    public ContatoPageCen05 fillAssunto(String a){
        driver.findElement(assunto).click();
        driver.findElement(assunto).sendKeys(a);
        return this;
    }

    public ContatoPageCen05 fillMensagem(String a){
        driver.findElement(sua_mensagem).click();
        driver.findElement(sua_mensagem).sendKeys(a);
        return this;
    }

    public ContatoPageCen05 clickOnEnviar(){
        driver.findElement(enviar).click();
        return this;
    }

    public String getGenericMessage(){
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".wpcf7-validation-errors")));
        return driver.findElement(erro_generico).getText();
    }

    public String getNomeMessage(){
        return driver.findElement(erro_nome_obg).getText();
    }

    public String getEmailMessage(){
        return driver.findElement(erro_email_obg).getText();
    }
}