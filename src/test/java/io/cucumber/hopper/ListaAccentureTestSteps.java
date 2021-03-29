package io.cucumber.hopper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.hopper.Servicos.Config;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ListaAccentureTestSteps {

    @Dado("clico no menu servicos")
    public void clicarNoMenuServicos() {
        Config.cssSelector(".nav-submenu:nth-child(2)").click();
    }

    @Entao("devo ver o servico Accenture Strategy")
    public void verOsServicos() {
        assertEquals(true, Config.cssSelectors("[aria-label='Accenture Strategy']").size() > 0);
    }

    @Dado("devo ver o servico {string}")
    public void verServicos(String string) throws InterruptedException {
        Thread.sleep(2000);
        switch (string) {
        case "Application Services":
            assertEquals(true, Config.cssSelectors("[aria-label='Application Services']").size() > 0);

        case "Artificial Intelligence":
            assertEquals(true, Config.cssSelectors("[aria-label='Artificial Intelligence']").size() > 0);
            break;

        case "Automation":
            assertEquals(true, Config.cssSelectors("[aria-label='Automation']").size() > 0);
            break;

        case "Business Process Services":
            assertEquals(true, Config.cssSelectors("[aria-label='Business Process Services']").size() > 0);
            break;

        case "Change Management":
            assertEquals(true, Config.cssSelectors("[aria-label='Change Management']").size() > 0);
            break;

        case "Cloud":
            assertEquals(true, Config.cssSelectors("[aria-label='Cloud']").size() > 0);
            break;

        case "Customer Experience":
            assertEquals(true, Config.cssSelectors("[aria-label='Customer Experience']").size() > 0);
            break;

        case "Data & Analytics":
            assertEquals(true, Config.cssSelectors("[aria-label='Data & Analytics']").size() > 0);
            break;

        case "Ecosystem Partners":
            assertEquals(true, Config.cssSelectors("[aria-label='Ecosystem Partners']").size() > 0);
            break;

        case "Finance Consulting":
            assertEquals(true, Config.cssSelectors("[aria-label='Finance Consulting']").size() > 0);
            break;

        case "Industry X":
            assertEquals(true, Config.cssSelectors("[aria-label='Industry X']").size() > 0);
            break;

        case "Infrastructure":
            assertEquals(true, Config.cssSelectors("[aria-label='Infrastructure']").size() > 0);
            break;

        case "Marketing":
            assertEquals(true, Config.cssSelectors("[aria-label='Marketing']").size() > 0);
            break;

        case "Mergers & Acquisitions (M&A)":
            assertEquals(true, Config.cssSelectors("[aria-label='Mergers & Acquisitions (M&A)']").size() > 0);
            break;

        case "Operating Models":
            assertEquals(true, Config.cssSelectors("[aria-label='Operating Models']").size() > 0);
            break;

        case "Security":
            assertEquals(true, Config.cssSelectors("[aria-label='Security']").size() > 0);
            break;

        case "Supply Chain Management":
            assertEquals(true, Config.cssSelectors("[aria-label='Supply Chain Management']").size() > 0);
            break;

        case "Sustainability":
            assertEquals(true, Config.cssSelectors("[aria-label='Sustainability']").size() > 0);
            break;

        case "Technology Consulting":
            assertEquals(true, Config.cssSelectors("[aria-label='Technology Consulting']").size() > 0);
            break;

        case "Technology Innovation":
            assertEquals(true, Config.cssSelectors("[aria-label='Technology Innovation']").size() > 0);
            break;

        case "Zero Based Budgeting (ZBB)":
            assertEquals(true, Config.cssSelectors("[aria-label='Zero Based Budgeting (ZBB)']").size() > 0);
            break;
        }

        string = null;
    }

    @Dado("clico no item do menu cloud")
    public void clicarNoItemDoMenuCloud() throws InterruptedException {
        Thread.sleep(5000);
        Config.cssSelector("a[href='/br-pt/services/cloud-index']").click();
    }

    @Entao("devo encontrar o titulo {string}")
    public void encontrarOTitulo(String string) {
        String textoElement = Config.cssSelector("h1[class='rte-inline col-xs-12 page-title ']").getText();
        assertEquals("Serviços de Cloud", textoElement);
        Config.fecharPagina();
    }
}
