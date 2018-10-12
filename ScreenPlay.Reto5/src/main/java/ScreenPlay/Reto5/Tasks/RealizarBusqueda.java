package ScreenPlay.Reto5.Tasks;

import ScreenPlay.Reto5.Interactions.Esperar15;
import ScreenPlay.Reto5.Interactions.Esperar5;
import ScreenPlay.Reto5.UserInterface.Ingresopagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RealizarBusqueda implements Task{
	
	public String parentWindow, strPage;
		
  	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue("Bancos").into(Ingresopagina.INGRESAR_PALABRA));
		actor.attemptsTo(Enter.theValue("Medellin").into(Ingresopagina.INGRESAR_UBICACION));
		actor.attemptsTo(Click.on(Ingresopagina.CLICK_EN_BUSCAR));
		actor.attemptsTo(Esperar5.aMoment()); 
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_1));
		actor.attemptsTo(Esperar5.aMoment()); 
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_2));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_3));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_4));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_5));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_6));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_7));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_8));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_9));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Click.on(Ingresopagina.BANCO_10));
		actor.attemptsTo(Esperar15.aMoment());
    }

	public static RealizarBusqueda abrirlink() {
		return Tasks.instrumented(RealizarBusqueda.class);
	}
}	
