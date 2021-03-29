package io.cucumber.hopper;

import io.cucumber.hopper.Servicos.Config;
import io.cucumber.java.pt.Dado;

public class SharedSteps {

	@Dado("que eu estou no site da accenture")
	public void abrindoPagina() {
		Config.abrirPagina("https://www.accenture.com/br-pt");
    }
}
