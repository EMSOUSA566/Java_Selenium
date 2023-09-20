package java_selenium.step;

import java.util.concurrent.TimeUnit;
import java_selenium.pages.homePage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cadastrarUser {

    WebDriver driver;
    homePage homePage;

    @Before
    public void  setup() {
        driver = new ChromeDriver();
        homePage = new homePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://bugbank.netlify.app/");

    }

    @Test
    public void testePositivoCadastro() {

        homePage.clicarEmRegistrar();
        homePage.preencherEmail();
        homePage.preencherNome();
        homePage.preencherSenha();
        homePage.preencherConfirmacaoSenha();
        homePage.clicarEmCriarComSaldo();
        homePage.clicarCadastrar();
        // homePage.modalCadastroSucess();

    }

    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();

    }
}