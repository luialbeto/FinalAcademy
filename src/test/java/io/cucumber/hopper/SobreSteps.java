package io.cucumber.hopper;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import io.cucumber.hopper.Servicos.Config;

public class SobreSteps{

    @Dado("que eu estou no site da accenture 5")
    public void que_eu_estou_no_site_da_accenture_5() {
        Config.abrir("https://www.accenture.com/br-pt");
    }

    @Dado("fecho a janela 2")
    public void fecho_a_janela_2() {
        WebElement input = Config.browser.findElement(By.cssSelector("#onetrust-close-btn-container"));
        input.click();
    }

    @Dado("clico no menu sobre a accenture")
    public void clico_no_menu_sobre_a_accenture() {
        WebElement input = Config.browser.findElement(By.cssSelector("#primaryLink5_SobreaAccenture"));
        input.click();
    }

    @Dado("clico no item do menu sobre a accenture")
    public void clico_no_item_do_menu_sobre_a_accenture() {
        WebElement input = Config.browser.findElement(By.cssSelector("a[href='/br-pt/about/company-index']"));
        input.click();
    }

    @Entao("devo ver o destaque {string}")
    public void devo_ver_o_destaque(String string) {
        WebElement input = Config.browser.findElement(By.cssSelector("div[class='row new-row']"));
        Config.fechar();
    }

}