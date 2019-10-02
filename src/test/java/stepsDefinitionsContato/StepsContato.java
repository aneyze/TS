package stepsDefinitionsContato;

import contato.Cen05Home.HomeContatoPage;
import contato.Cen05Page.ContatoPageCen05;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import login.Cen03.HomeLoginPage;
import login.Cen04.LoginPageCen04;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import login.Cen03.LoginPageCen03;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsContato {
    private WebDriver driver;

    HomeContatoPage homePageContato;
    ContatoPageCen05 contatoPageCen05;


    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aneyz\\projects\\TS\\libs\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePageContato = new HomeContatoPage(driver);
        contatoPageCen05 = new ContatoPageCen05(driver);
    }

    @After
    public void afterScenario(){
        this.driver.quit();
    }


    @Given("^a web browser is opened - contato$")
    public void aWebBrowserIsOpenedContato() {
        homePageContato.accessPageContato();
    }


    @When("^the user clicks on Contato$")
    public void theUserClicksOnContato() {
        homePageContato.clickOnContato();
    }



    @And("^the user enters the fields \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" and clicks on Enviar$")
    public void theUserEntersTheFieldsAndAndClicksOnEnviar(String arg0, String arg1, String arg2) {
        contatoPageCen05.fillTelefone(arg0).fillAssunto(arg1).fillMensagem(arg2).clickOnEnviar();
    }


    @Then("^The message \"([^\"]*)\" is shown$")
    public void theMessageIsShown(String arg0) {
        String expectedGenericMessage = contatoPageCen05.getGenericMessage();

        Assert.assertEquals(arg0, expectedGenericMessage);
        System.out.println("Mensagem genérica encontrada: " + expectedGenericMessage + "\n");
        System.out.println("Mensagem genérica esperada: " + arg0 + "\n");

        System.out.println("\nSucesso");
    }


}
