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

public class ListaTestSteps{

    public ListaTestSteps() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    }
    
    @Dado("que eu estou no site da accenture")
    public void que_eu_estou_no_site_da_accenture() {
        Config.abrir("https://www.accenture.com/br-pt");
    }

    
}