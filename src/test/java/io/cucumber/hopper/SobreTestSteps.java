package io.cucumber.hopper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.hopper.Servicos.Config;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class SobreTestSteps {

	@Dado("clico no menu sobre a accenture")
	public void clicarNoMenuSobreAAccenture() {
	    Config.cssSelector(".nav-submenu:nth-child(5)").click();
	}

	@Dado("clico no item do menu sobre a accenture")
	public void clicarNoItemDoMenuSobreAAccenture() throws InterruptedException {
		Thread.sleep(3000);
		Config.linkText("Sobre a Accenture").click();
	}

	@Entao("devo ver o destaque em {string}")
	public void verODestaque(String string) {
	    assertEquals(string, Config.cssSelector(".sectionTitle").getText());
	    Config.fecharPagina();
	}
}
