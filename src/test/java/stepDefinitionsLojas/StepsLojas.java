package stepDefinitionsLojas;

import lojas.Cen01.LojasPageCen01;
import lojas.Cen01.HomeLojasPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lojas.Cen02.LojasPageCen02;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepsLojas {

    private WebDriver driver;

    HomeLojasPage homePageLojas;
    LojasPageCen01 lojasPageCen01;
    LojasPageCen02 lojasPageCen02;

    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marilia.santos\\IdeaProjects\\TS\\libs\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePageLojas = new HomeLojasPage(driver);
        lojasPageCen01 = new LojasPageCen01(driver);
        lojasPageCen02 = new LojasPageCen02(driver);

    }

    @After
    public void afterScenario(){
        this.driver.quit();
    }




    @Given("^a web browser is opened - lojas$")
    public void aWebBrowserIsOpenedLojas() {
        homePageLojas.accessPageLojas();
    }

    @When("^the user clicks on Lojas$")
    public void theUserClicksOnLojas() {
        homePageLojas.clickOnLojas();
    }

    @When("^the user enters the field pesquisa texto with \"([^\"]*)\" and clicks on Buscar$")
    public void theUserEntersTheFieldPesquisaTextoWithAndClicksOnBuscar(String arg0) {
        lojasPageCen01.fillPesquisaTexto(arg0);
        lojasPageCen01.clickOnBuscar();
    }

    @Then("^the message \"([^\"]*)\" is showed$")
    public void theMessageIsShowed(String arg0) {
        String expectedTitle = lojasPageCen01.getTitle();
        Assert.assertEquals(arg0, expectedTitle);
        System.out.println("\nSucesso");

        System.out.println("Mensagem encontrada: " + expectedTitle + "\n");
        System.out.println("Mensagem esperada: " + arg0 + "\n");
    }

    @When("^the user enters the field pesquisa categoria with \"([^\"]*)\" and clicks on Buscar$")
    public void theUserEntersTheFieldPesquisaCategoriaWithAndClicksOnBuscar(String arg0)  {
       lojasPageCen02.clickOnPesquisaCategoria().fillPesquisaCategoria(arg0).clickOnBuscar();
    }

    @Then("^validate return$")
    public void validateReturn() {


    }

    @Then("^links related to 'Maquiagem' are shown with these values \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void linksRelatedToMaquiagemAreShownWithTheseValues(String arg0, String arg1, String arg2) {
        int i = 0;
        String expectedLoja1 = lojasPageCen02.getTitleLoja1();
        if(expectedLoja1!=null)
            i = i+1;
        String expectedLoja2 = lojasPageCen02.getTitleLoja2();
        if(expectedLoja2!=null)
            i = i+1;
        String expectedLoja3 = lojasPageCen02.getTitleLoja3();
         if(expectedLoja3!=null)
            i = i+1;
        System.out.println("Total de lojas encontradas = " + i);
        Assert.assertEquals(arg0, expectedLoja1);
        Assert.assertEquals(arg1, expectedLoja2);
        Assert.assertEquals(arg2, expectedLoja3);
        System.out.println("Loja1 encontrada: " + expectedLoja1 + "\n");
        System.out.println("Loja1 esperada: " + arg0 + "\n");

        System.out.println("Loja2 encontrada: " + expectedLoja2 + "\n");
        System.out.println("Loja2 esperada: " + arg1 + "\n");

        System.out.println("Loja3 encontrada: " + expectedLoja3 + "\n");
        System.out.println("Loja3 esperada: " + arg2 + "\n");



    }



}