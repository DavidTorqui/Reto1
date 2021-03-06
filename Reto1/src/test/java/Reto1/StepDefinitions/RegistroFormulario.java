package Reto1.StepDefinitions;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import Reto1.Model.ValoresFormulario;
import Reto1.Questions.LaRespuesta;
import Reto1.Tasks.Abrir;
import Reto1.Tasks.DiligenciarFormulario;
import Reto1.Tasks.IngresarPagina;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroFormulario {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor david = Actor.named("David");
	
	@Before
	public void configuracionInicial() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que david necesita ingresar a la pagina con usuario (.*) y contraseña (.*)$")
	public void queDavidNecesitaIngresarALaPaginaConUsuarioDemoYContraseñaDemo(String usuario, String contraseña) {
		david.wasAbleTo(Abrir.lapaginaweb());
		david.attemptsTo(IngresarPagina.usuario(usuario,contraseña));
	}

	@Cuando("^el realiza el registro del mismo en el aplicativo$")
	public void elRealizaElRegistroDelMismoEnElAplicativo(List<ValoresFormulario> valoresformulario) {
		david.attemptsTo(DiligenciarFormulario.valores(valoresformulario));
	
	}

	@Entonces("^valida que no tenga mensaje de error$")
	public void validaQueNoTengaMensajeDeError() {
	david.should(GivenWhenThen.seeThat(LaRespuesta.es(), Matchers.equalTo(true)));
	}
}
