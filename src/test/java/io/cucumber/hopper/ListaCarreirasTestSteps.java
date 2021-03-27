package io.cucumber.hopper;

import io.cucumber.hopper.Servicos.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ListaCarreirasTestSteps{
    @Dado("que eu estou no site da accenture 3")
    public void que_eu_estou_no_site_da_accenture_3() {
        Config.abrir("https://www.accenture.com/br-pt");
    }

    @Dado("clico no item do menu vagas em tecnologia")
    public void clico_no_item_do_menu_vagas_em_tecnologia() {
    
    }


    @Entao("devo ver o destaque em {string}")

    public void devo_ver_o_destaque(String string) {

    }

    @Dado("digito no campo de busca {string}")
    public void digito_no_campo_de_busca(String string) {

    }

    @Dado("clico no botao procurar")
    public void clico_no_botao_procurar() {
  
    }

    @Entao("devo encontrar vagas para programadores")
    public void devo_encontrar_vagas_para_programadores() {

    }
}
