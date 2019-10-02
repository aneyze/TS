package stepsDefinitionsLogin;

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


public class StepsLogin {

    private WebDriver driver;

    HomeLoginPage homePageLogin;
    LoginPageCen03 loginPageCen03;
    LoginPageCen04 loginPageCen04;

    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aneyz\\projects\\TS\\libs\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePageLogin = new HomeLoginPage(driver);
        loginPageCen03 = new LoginPageCen03(driver);
        loginPageCen04 = new LoginPageCen04(driver);

    }

    @After
    public void afterScenario(){
        this.driver.quit();
    }



    @Given("^a web browser is opened - login$")
    public void aWebBrowserIsOpenedLogin() {
        homePageLogin.accessPageLogin();
    }

    @When("^the user clicks on Entrar$")
    public void theUserClicksOnEntrar() {
        homePageLogin.clickOnLogin();
    }


    @And("^the user enters \"([^\"]*)\" and \"([^\"]*)\" and clicks on Acessar$")
    public void theUserEntersAndAndClicksOnAcessar(String arg0, String arg1) {
        loginPageCen03.fillUsuario(arg0).fillSenha(arg1).clickOnAcessar();
    }

    @Then("^the follow message \"([^\"]*)\" is shown$")
    public void theFollowMessageIsShown(String arg0) {
        String expectedMessage = loginPageCen03.getMessage();
        Assert.assertEquals(arg0, expectedMessage);

        System.out.println("Mensagem encontrada: " + expectedMessage + "\n");
        System.out.println("Mensagem esperada: " + arg0 + "\n");
        System.out.println("\nSucesso");
    }


    @And("^the user clicks on Esqueceu a Senha and presses ENTER in the field E-mail$")
    public void theUserClicksOnEsqueceuASenhaAndPressesENTERInTheFieldEMail()  {
        loginPageCen04.clickOnEsqueceu().pressEnter();
    }


    @Then("^the follow error message \"([^\"]*)\" is shown$")
    public void theFollowErrorMessageIsShown(String arg0) {
        String expectedMessageError = loginPageCen04.getMessageError();;
        Assert.assertEquals(arg0, expectedMessageError);

        System.out.println("Mensagem encontrada: " + expectedMessageError + "\n");
        System.out.println("Mensagem esperada: " + arg0 + "\n");
        System.out.println("\nSucesso");


    }
}