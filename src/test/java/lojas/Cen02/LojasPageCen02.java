package lojas.Cen02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LojasPageCen02 {

    private WebDriver driver;

    public LojasPageCen02(WebDriver driver){
        this.driver = driver;
    }

    //Element locators
    private By pesquisaCategoria = By.cssSelector(".select2-selection__rendered .select2-selection__placeholder:nth-child(1)");
    private By fillpesquisaCategoria = By.cssSelector(".select2-search__field");
    private By buscar = By.cssSelector("#searchFilter");
    private By loja1 = By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/adcos/']");
    private By loja2 = By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/mahogany/'] span");
    private By loja3 = By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/sephora/'] span");


    //Interactions

    public LojasPageCen02 clickOnPesquisaCategoria(){
        driver.findElement(pesquisaCategoria).click();
        return this;
    }

    public LojasPageCen02 fillPesquisaCategoria(String a){
        driver.findElement(fillpesquisaCategoria).sendKeys(a);
        driver.findElement(fillpesquisaCategoria).sendKeys(Keys.ENTER);
        return this;
    }

    public LojasPageCen02 clickOnBuscar(){
        driver.findElement(buscar).click();
        return this;
    }

    //public String getTitleLoja1(){
        //WebDriverWait wait = new WebDriverWait (driver, 10);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/adcos/']")));
        //return driver.findElement(loja1).getText();
    //}

    public String getTitleLoja2(){
        WebDriverWait wait = new WebDriverWait (driver, 10);
        Actions action = new Actions(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/mahogany/'] span")));
        WebElement webElement = driver.findElement(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/mahogany/'] span"));
        action.moveToElement(webElement).build().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.findElement(loja2).getText();
    }

    public String getTitleLoja3(){
        WebDriverWait wait = new WebDriverWait (driver, 10);
        Actions action1 = new Actions(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/sephora/'] span")));
        WebElement webElement1 = driver.findElement(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/sephora/'] span"));
        action1.moveToElement(webElement1).build().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.findElement(loja3).getText();
    }

}

