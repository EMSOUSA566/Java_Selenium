package java_selenium.pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
    WebDriver driver;

    String btnRegistrar = "//button[text()='Registrar']";
    String email = "(//input[@name='email'])[2]";
    String nome = "//input[@type='name']";
    String senha = "(//input[@name='password'])[2]";
    String confirmSenha = "(//input[@type='password'])[3]";
    String criarSaldo = "(//*[@id='toggleAddBalance'])";
    String cadastrar = "//button[text()='Cadastrar']";
    String btnFecharModal = "(//*[@class='styles__Button-sc-8zteav-5 gyHUvN'])";

    public homePage(WebDriver driverParametro) {
        this.driver = driverParametro;
    }

    public void clicarEmRegistrar() {
        driver.findElement(By.xpath(btnRegistrar)).click();
    }

    public void preencherEmail() {
        driver.findElement(By.xpath(email)).sendKeys("teste10@hotmail.com");

    }

    public void preencherNome() {
        driver.findElement(By.xpath(nome)).sendKeys("QA Academy");
    }

    public void preencherSenha() {
        driver.findElement(By.xpath(senha)).sendKeys("teste");
    }

    public void preencherConfirmacaoSenha() {
        driver.findElement(By.xpath(confirmSenha)).sendKeys("teste");
    }

    public void clicarEmCriarComSaldo() {
        driver.findElement(By.xpath(criarSaldo)).click();

    }

    public void clicarCadastrar() {
        driver.findElement(By.xpath(cadastrar)).click();
    }

    // public void modalCadastroSucess() {
    //     WebElement modal = driver.findElement(By.xpath(btnFecharModal));
    //     WebDriverWait(driver, Duration.ofSeconds(3));
    //     String textoElement = modal.getText();
    //     assertEquals("foi criada com sucesso", textoElement);
    }

