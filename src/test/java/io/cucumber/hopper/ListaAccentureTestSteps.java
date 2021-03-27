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

public class ListaAccentureTestSteps{

    public ListaAccentureTestSteps() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    }
    
    @Dado("que eu estou no site da accenture")
    public void que_eu_estou_no_site_da_accenture() {
        Config.abrir("https://www.accenture.com/br-pt");
    }

    @Dado("clico no menu servicos")
    public void clico_no_menu_servicos() {
        WebElement input = Config.browser.findElement(By.cssSelector("#primaryLink2_Servios"));
        input.click();
    }

    @Entao("devo ver os servicos abaixo")
    public void devo_ver_os_servicos_abaixo(io.cucumber.datatable.DataTable dataTable) {
        assertEquals(true , Config.browser.findElements( By.cssSelector("[class = 'gh-item nav-submenu-label']")).size() > 0);
            Config.browser.quit();

        //assertEquals(true, Config.seletorQueryCssTodos("div[class = 'nav-item-links']").size(>0));
        //Config.selectorQueryCss("div[class = 'nav-item-links']");
        //Config.fechar();
    }

}