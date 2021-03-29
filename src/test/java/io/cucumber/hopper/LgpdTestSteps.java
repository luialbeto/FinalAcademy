package io.cucumber.hopper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.hopper.Servicos.Config;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class LgpdTestSteps {

    @Dado("aceito os termos LGPD")
    public void aceitarTermosLgpd() {
        Config.cssSelector("#onetrust-pc-btn-handler").click();
    }

    @Entao("deve fechar a caixa de informacao")
    public void fecharCaixaDeInformacao() {
        Config.cssSelector("#close-pc-btn-handler");
        Config.fecharPagina();
    }

    @Dado("clico em configuracoes de cookie")
    public void clicarEmConfiguracoesDeCookie() throws InterruptedException {
        Thread.sleep(2000);
        Config.cssSelector("#onetrust-pc-btn-handler").click();
    }

    @Entao("devo ver o item de {string}")
    public void verOItemSuaPrivacidade(String string) throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(string, Config.cssSelector(".active-group").getText());
    }

    @Entao("devo ver {string}")
    public void verCookies(String string) {
        switch (string) {
        case "Cookies estritamente necessárias":
            assertEquals(true, Config.cssSelectors("#ot-header-id-1").size() > 0);
            break;

        case "Cookies Analiticos de Primeira Parte":
            assertEquals(true, Config.cssSelectors("#ot-header-id-2").size() > 0);
            break;

        case "Cookies de Desempenho e Cookies Funcionais":
            assertEquals(true, Config.cssSelectors("#ot-header-id-3").size() > 0);
            break;

        case "Cookies de Publicidade e Redes Sociais":
            assertEquals(true, Config.cssSelectors("#ot-header-id-4").size() > 0);
            break;
        }
        string = null;

    }

}
