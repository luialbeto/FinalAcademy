package io.cucumber.hopper.Servicos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Config {
    public static WebDriver browser;

    public static void abrir(String url){
        if(browser == null){
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            browser = new ChromeDriver();
        }
        browser.get(url);
    }

    public static void fechar(){
        browser.quit();
        browser = null;
    }

}
