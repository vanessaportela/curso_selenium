package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

import static support.Utils.getRandomEmail;


public class CadastroPage extends RunCucumberTest {

    private By name = By.id("user");
    private By email = By.id("email");
    private By password = By.id("password");
    private By btnRegister = By.id("btnRegister");

    private By creat_user_field = By.id("user");

    public void acessarTelaInicial() {
        getDriver().manage().window().maximize();
        getDriver().get("http://automationpratice.com.br");
    }

    public void acessarTelaCadastro() {
        getDriver().findElement(By.cssSelector("#top_header > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")).click();
        Utils.waitElementBePresent(creat_user_field, 20);
    }

    public void preencheNome(String names) {
        getDriver().findElement(name).sendKeys(names);
    }

    public void preencheEmail() {
        getDriver().findElement(email).sendKeys(getRandomEmail());
    }

    public void preencheSenha(String passwords) {
        getDriver().findElement(password).sendKeys(passwords);
    }

    public void clickCadastrar() {
        driver.findElement(btnRegister).click();
    }

    public void validaCadastro(String mensagem) {
        String resultado_atual = driver.findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Cadastro realizado!", resultado_atual);
    }
}
