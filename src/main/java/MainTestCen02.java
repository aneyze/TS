

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class MainTestCen02{
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

        //clicar em lojas
        WebElement w1 = driver.findElement(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas']"));
        w1.click();

        //clicar em pesquisar categoria
        WebElement w2 = driver.findElement(By.cssSelector(".select2-selection__rendered .select2-selection__placeholder:nth-child(1)"));
        w2.click();

        //digitar "maquiagem" em pesquisar categoria
        WebElement w3 = driver.findElement(By.cssSelector(".select2-search__field"));
        w3.sendKeys("Maquiagem");
        w3.sendKeys(Keys.ENTER);

        //clicar em buscar
        WebElement w4 = driver.findElement(By.cssSelector("#searchFilter"));
        w4.click();

        //validar retorno de três lojas
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/alice-salazar-store/']")));
        WebElement w5 = driver.findElement(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/alice-salazar-store/']"));
        System.out.println(w5.getText());
        i=1;



        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/for-make-up/'] span")));
        Actions action = new Actions(driver);
        WebElement w6 = driver.findElement(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/for-make-up/'] span"));
        action.moveToElement(w6).build().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(w6.getText());
        i = i + 1;

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/sephora/'] span")));
        WebElement w7 = driver.findElement(By.cssSelector("a[href='https://vivariomarrecife.com.br/lojas/sephora/'] span"));
        action.moveToElement(w7).build().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(w7.getText());
        i= i + 1;

        //retornando o total de lojas encontradas
        System.out.println("Total de lojas encontradas = " + i);

        //deu tudo certo
        System.out.println("\nSucesso");

        //Fechar o browser
        driver.quit();
    }
}
