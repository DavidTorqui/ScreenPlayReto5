package ScreenPlay.Reto5.StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import ScreenPlay.Reto5.Model.Registrarurl;
import ScreenPlay.Reto5.Tasks.Abrir;
import ScreenPlay.Reto5.Tasks.RealizarBusqueda;
import ScreenPlay.Reto5.Tasks.ValidarBusqueda;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarBancos {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor david = Actor.named("David");
	
	@Before
	public void configuracionInicial() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
		
	@Dado("^que quiero realizar la consulta de diez bancos$")
	public void queQuieroRealizarLaConsultaDeBancos()  {
		david.wasAbleTo(Abrir.lapaginaweb());
	}

	@Cuando("^se despliega la informacion de estos$")
	public void seDespliegaLaInformacionDeEstos() {
		david.attemptsTo(RealizarBusqueda.abrirlink());
	}

	@Entonces("^verifico que el link de la pagina web lleve al banco correspondiente$")
	public void verificoQueElLinkDeLaPaginaWebLleveAlBancoCorrespondiente(List<Registrarurl> urls) {
		david.attemptsTo(ValidarBusqueda.comparar(urls));
	}
}