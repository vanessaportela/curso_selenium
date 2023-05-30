package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CadastroPage extends Utils {
    WebDriver driver;

    private By name = By.id("user");
    private By email = By.id("email");
    private By password = By.id("password");
    private By btnRegister = By.id("btnRegister");


    private By creat_user_field = By.id("user");
    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaInicial() {
        driver.manage().window().maximize();
        driver.get("http://automationpratice.com.br");
    }

    public void acessarTelaCadastro() {
        driver.findElement(By.cssSelector("#top_header > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")).click();
        waitElementBePresent(creat_user_field, 20);
    }

    public void preencheNome(String names) {
        driver.findElement(name).sendKeys(names);
    }

    public void preencheEmail() {
        driver.findElement(email).sendKeys(getRandomEmail());
    }

    public void preencheSenha(String passwords) {
        driver.findElement(password).sendKeys(passwords);
    }

    public void clickCadastrar() {
        driver.findElement(btnRegister).click();
    }

    public void validaCadastro(String mensagem) {
        String resultado_atual = driver.findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Cadastro realizado!", resultado_atual);
    }
}
