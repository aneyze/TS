

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainTestCen05{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world");
        int i=0;
        //Propriedades do chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marilia.santos\\IdeaProjects\\TS\\libs\\chromedriver.exe");

        //Iniciar o driver para interagir com o chrome
        WebDriver driver = new ChromeDriver();


        //Enviar a url para abrir o browser
        driver.get("https://vivariomarrecife.com.br/");

        //Mazimiza o browser
        driver.manage().window().maximize();

        //clicar em contato
        WebElement w1 = driver.findElement(By.cssSelector("a[href='https://vivariomarrecife.com.br/contato']"));
        w1.click();

        //clicar em telefone e preencher telefone
        WebElement w2 = driver.findElement(By.cssSelector(".telefone input"));
        w2.click();
        w2.sendKeys("(82) 98889-2989");

        //clicar em assunto e preencher assunto
        WebElement w3 = driver.findElement(By.cssSelector(".your-subject input"));
        w3.click();
        w3.sendKeys("Meu Assunto Favorito");

        //clicar em sua mensagem e preencher sua mensagem
        WebElement w4 = driver.findElement(By.cssSelector(".your-message textarea"));
        w4.click();
        w4.sendKeys("Minha mensagem é muito longa");

        //clicar em enviar
        WebElement w5 = driver.findElement(By.cssSelector(".wpcf7-form-control.wpcf7-submit"));
        w5.click();


        //wait explícito
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".wpcf7-validation-errors")));


        //validar retorno de erro no fim da tela
        WebElement w6 = driver.findElement(By.cssSelector(".wpcf7-validation-errors"));
        System.out.println(w6.getText());

        //validar retorno de erro abaixo do campo nome
        WebElement w7 = driver.findElement(By.cssSelector(".your-name .wpcf7-not-valid-tip"));
        System.out.println(w7.getText());

        //validar retorno de erro abaixo do campo e-mail
        WebElement w8 = driver.findElement(By.cssSelector(".your-email .wpcf7-not-valid-tip"));
        System.out.println(w8.getText());


        //deu tudo certo
        System.out.println("\nSucesso");

        //Fechar o browser
        driver.quit();
    }
}