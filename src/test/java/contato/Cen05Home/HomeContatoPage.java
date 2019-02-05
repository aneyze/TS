package contato.Cen05Home;

import contato.Cen05Page.ContatoPageCen05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeContatoPage {

    private WebDriver driver;
    private String pageUrl = "https://vivariomarrecife.com.br/";

    public HomeContatoPage (WebDriver driver){
        this.driver = driver;
    }

    //Element locators
    private By contato = By.cssSelector("a[href='https://vivariomarrecife.com.br/contato']");

    //Interactions
    public HomeContatoPage accessPageContato(){
        driver.get(this.pageUrl);
        return this;
    }

    public ContatoPageCen05 clickOnContato(){
        driver.findElement(contato).click();
        return new ContatoPageCen05(driver);
    }

}
