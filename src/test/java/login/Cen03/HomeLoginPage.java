package login.Cen03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeLoginPage {

    private WebDriver driver;
    private String pageUrl = "https://vivariomarrecife.com.br/";

    public HomeLoginPage (WebDriver driver){
        this.driver = driver;
    }

    //Element locators
    private By login = By.cssSelector("a[href='https://vivariomarrecife.com.br/login']");

    //Interactions
    public HomeLoginPage accessPageLogin(){
        driver.get(this.pageUrl);
        return this;
    }

    public LoginPageCen03 clickOnLogin(){
        driver.findElement(login).click();
        return new LoginPageCen03(driver);
    }

}
