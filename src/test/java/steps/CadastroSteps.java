package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Dado("^que estou na tela inicial$")
    public void que_estou_na_tela_inicial() {
        getDriver(RunBase.Browser.CHROME);
        cadastroPage.acessarTelaInicial();
    }

    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() {
        cadastroPage.acessarTelaCadastro();
    }

    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro() {
        cadastroPage.preencheNome("Lulu Portela");
        cadastroPage.preencheEmail();
        cadastroPage.preencheSenha("123456");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clickCadastrar();
    }

    @Então("^vejo a mensagem de cadastro realizado$")
    public void vejo_a_mensagem_de_cadastro_realizado() {
        cadastroPage.validaCadastro("Cadastro realizado!");
    }
}
