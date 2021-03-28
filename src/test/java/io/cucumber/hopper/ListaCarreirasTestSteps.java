package io.cucumber.hopper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.hopper.Servicos.Config;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ListaCarreirasTestSteps{
    @Dado("que eu estou no site da accenture 3")
    public void que_eu_estou_no_site_da_accenture_3() {
        Config.abrir("https://www.accenture.com/br-pt");
    }

    @Dado("clico no menu carreiras")
    public void clico_no_menu_carreiras() {
        WebElement input = Config.browser.findElement(By.cssSelector("div[data-id='primaryLink4_Carreiras']"));
        input.click();
    }

    @Entao("devo ver o destaque em {string}")

    public void devo_ver_o_destaque(String string) {

    }

    @Dado("digito no campo de busca {string}")
    public void digito_no_campo_de_busca(String string) {
        WebElement input = Config.browser.findElement(By.cssSelector("#search-form-label");
        input.type("DESENVOLVEDOR");
    }

    @Dado("clico no botao procurar")
    public void clico_no_botao_procurar() {
        WebElement input = Config.browser.findElement(By.cssSelector(".search-text");
        input.click();
    }

    @Entao("devo encontrar vagas para programadores")
    public void devo_encontrar_vagas_para_programadores() {

    }
}
