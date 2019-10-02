

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainTestCen04{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world");
        int i=0;
        //Propriedades do chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aneyz\\projects\\TS\\libs\\chromedriver.exe");

        //Iniciar o driver para interagir com o chrome
        WebDriver driver = new ChromeDriver();


        //Enviar a url para abrir o browser
        driver.get("https://vivariomarrecife.com.br/");

        //Mazimiza o browser
        driver.manage().window().maximize();

        //clicar em login
        WebElement w1 = driver.findElement(By.cssSelector("a[href='https://vivariomarrecife.com.br/login']"));
        w1.click();

        //clicar em esqueceu a senha
        WebElement w2 = driver.findElement(By.cssSelector(".login-lostPwd.metaFont"));
        w2.click();

        //wait implícito
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //clicar em E-mail e pressionar ENTER
        WebElement w3 = driver.findElement(By.cssSelector("[name='user_login']"));
        w3.click();
        w3.sendKeys(Keys.ENTER);

        //wait implícito
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //validar retorno de erro
        WebElement w4 = driver.findElement(By.cssSelector(".login-msg"));
        System.out.println(w4.getText());


        //deu tudo certo
        System.out.println("\nSucesso");

        //Fechar o browser
        driver.quit();
    }
}
