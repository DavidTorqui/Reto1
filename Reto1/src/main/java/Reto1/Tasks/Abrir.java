package Reto1.Tasks;

import Reto1.UserInterface.IngresarLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	private IngresarLogin ingresarlogin;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(ingresarlogin));
	}
	
	public static Abrir lapaginaweb() {
		return Tasks.instrumented(Abrir.class);
	}
}
