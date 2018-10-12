package ScreenPlay.Reto5.Tasks;

import ScreenPlay.Reto5.UserInterface.Ingresopagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{
	
	private Ingresopagina ingresopagina;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(ingresopagina));
	}
	
	public static Abrir lapaginaweb() {
		return Tasks.instrumented(Abrir.class);
	}
}