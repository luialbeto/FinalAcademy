package io.cucumber.hopper;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.hopper.Servicos.Config;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class LgpdTestSteps{

    public LgpdTestSteps() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    }    

    
    @Dado("que eu estou no site da accenture")
    public void que_eu_estou_no_site_da_accenture() {
        Config.abrir("https://www.accenture.com/br-pt");
    }

    

    @Dado("aceito os termos LGPD")
    public void aceito_os_termos_LGPD() {
        WebElement input = Config.browser.findElement(By.cssSelector("#onetrust-pc-btn-handler"));
        input.click();
        
    }

    @Entao("deve fechar a caixa de informacao")
    public void deve_fechar_a_caixa_de_informacao() {
        WebElement input = Config.browser.findElement(By.cssSelector("#close-pc-btn-handler"));
        input.click();
        Config.fechar();
    }

    @Dado("clico em configuracoes de cookie")
    public void clico_em_configuracoes_de_cookie() {
        WebElement input = Config.browser.findElement(By.cssSelector("#optanon-minimize-button"));
        input.click();
    }

    
    @Entao("devo ver o item de {string}")
    public void devo_ver_o_item_de(String string) {
        WebElement input = Config.browser.findElement(By.cssSelector("#privacy-text"));
        assertEquals(string, input.getText());
    
    }

    @Entao("devo ver {string}")
    public void devo_ver(String string) {
    }
}

public class ListaCarreirasTestSteps.java {
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
    public void clico_no_botao_procurar()throws InterruptedException  {
  
    }

    @Entao("devo encontrar vagas para programadores")
    public void devo_encontrar_vagas_para_programadores() {

    }
}