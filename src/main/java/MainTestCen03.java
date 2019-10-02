

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainTestCen03{
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

        //clicar em nome de usuário e preenche blabla
        WebElement w2 = driver.findElement(By.cssSelector(".login-username label+input"));
        w2.click();
        w2.sendKeys("blabla");

        //clicar em senha e preenche 123456
        WebElement w3 = driver.findElement(By.cssSelector(".login-password label+input"));
        w3.click();
        w3.sendKeys("123456");

        //clicar em acessar
        WebElement w4 = driver.findElement(By.cssSelector(".login-submit input:nth-child(1)"));
        w4.click();

        //wait implícito
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //validar retorno de erro
        WebElement w5 = driver.findElement(By.cssSelector("p.login-msg"));
        System.out.println(w5.getText());


        //deu tudo certo
        System.out.println("\nSucesso");

        //Fechar o browser
        driver.quit();
    }
}
