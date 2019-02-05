package lojas.Cen01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LojasPageCen01 {

    private WebDriver driver;

    public LojasPageCen01(WebDriver driver){
        this.driver = driver;
    }

    //Element locators
    private By pesquisaTexto = By.cssSelector(".form-inline-filter.stores-filter input[placeholder='Pesquisa de texto']");
    private By buscar = By.cssSelector("#searchFilter");
    private By nenhum = By.cssSelector(".cmsmasters_clients_items.slides.code-response h2");

    //Interactions

    public LojasPageCen01 fillPesquisaTexto(String a){
        driver.findElement(pesquisaTexto).sendKeys(a);
        driver.findElement(pesquisaTexto).sendKeys(Keys.ENTER);
        return this;
    }

    public LojasPageCen01 clickOnBuscar(){
        driver.findElement(buscar).click();
        return this;
    }

    public String getTitle(){
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cmsmasters_clients_items.slides.code-response h2")));
        return driver.findElement(nenhum).getText();
    }
}
