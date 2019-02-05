
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTestCen01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world");

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

        //digitar "lala" em pesquisa de texto
        WebElement w2 = driver.findElement(By.cssSelector(".form-inline-filter.stores-filter input[placeholder='Pesquisa de texto']"));
        w2.sendKeys("Lala");
        w2.sendKeys(Keys.ENTER);

        //clicar em buscar
        WebElement w3 = driver.findElement(By.cssSelector("#searchFilter"));
        w3.click();

        //validar retorno da mensagem "nenhum resultado encontrado"
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cmsmasters_clients_items.slides.code-response h2")));
        WebElement w4 = driver.findElement(By.cssSelector(".cmsmasters_clients_items.slides.code-response h2"));
        System.out.println(w4.getText());

        //deu tudo certo
        System.out.println("\nSucesso");

        //Fechar o browser
        driver.quit();
    }
}
