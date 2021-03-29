package io.cucumber.hopper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.hopper.Servicos.Config;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ListaCarreirasTestSteps {

    @Dado("clico no menu carreiras")
    public void clicarNoMenuCarreiras() {
        Config.cssSelector(".nav-submenu:nth-child(4)").click();
    }

    @Dado("clico no item do menu vagas em tecnologia")
    public void clicarNoItemVagasEmTecnologia() throws InterruptedException {
        Thread.sleep(3000);
        Config.linkText("Vagas em tecnologia").click();
    }

    @Entao("devo ver o destaque {string}")
    public void verODestaque(String string) {
        assertEquals(string, Config.cssSelector(".page-title-long").getText());
        Config.fecharPagina();
    }

    @Dado("clico em procure por vagas")
    public void procurarPorVagas() throws InterruptedException {
        Thread.sleep(3000);
        Config.cssSelector("a[href='/br-pt/careers/jobsearch']").click();
    }

    @Dado("digito no campo de busca {string}")
    public void digitarNoCampoDeBusca(String string) throws InterruptedException {
        Config.byId("job-search-hero-bar").sendKeys(string);
    }

    @Dado("clico no botao procurar")
    public void clicarNoBotaoProcurar() throws InterruptedException {
        Config.cssSelector(".btn-primary.col-xs-12").click();
        Thread.sleep(4000);
    }

    @Entao("devo encontrar vagas para programadores")
    public void encontrarVagasParaProgramadores() {
        assertEquals(true, Config.cssSelectors(".search-results-text").size() > 0);
        Config.fecharPagina();
    }

}
