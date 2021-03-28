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

    
    @Dado("que eu estou no site da accenture 1")
    public void que_eu_estou_no_site_da_accenture_1() {
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
        WebElement input = Config.browser.findElement(By.cssSelector("#optanon-minimize-wrapper"));
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
