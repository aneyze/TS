package lojas.Cen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeLojasPage {

    private WebDriver driver;
    private String pageUrl = "https://vivariomarrecife.com.br/";

    public HomeLojasPage (WebDriver driver){
        this.driver = driver;
    }

    //Element locators
    private By lojas = By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas']");

    //Interactions
    public HomeLojasPage accessPageLojas(){
        driver.get(this.pageUrl);
        return this;
    }

    public LojasPageCen01 clickOnLojas(){
        driver.findElement(lojas).click();
        return new LojasPageCen01(driver);
    }

}
