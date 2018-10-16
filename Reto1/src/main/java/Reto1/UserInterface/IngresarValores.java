package Reto1.UserInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarValores extends PageObject{
	
	public static final Target BOTON_MENU = Target.the("INGRESA AL MENU ")
			.located(By.xpath("//*[@id=\"menu\"]/li[6]/a"));
	public static final Target BOTON_SUBMENU = Target.the("INGRESA AL SUB MENU BLOCKVALIDATION")
			.located(By.xpath("//*[@id=\"menu\"]/li[6]/ul/li[2]/a"));
	public static final Target CODIGO = Target.the("INGRESA EL CODIGO AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"required2\"]"));
	public static final Target CORREO = Target.the("INGRESA EL CORREO AL FORMULARIO")
			.located(By.xpath("//*[@id=\"email2\"]"));
	public static final Target CONTRASEÑA = Target.the("INGRESA LA CONTRASEÑA AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"password2\"]"));
	public static final Target CONFIRMAR_CONTRASEÑA = Target.the("INGRESA LA CONFIRMACION DE LA CONTRASEÑA AL FORMULARIO")
			.located(By.xpath("//*[@id=\"confirm_password2\"]"));
	public static final Target FECHA = Target.the("INGRESALA FECHA AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"date2\"]"));
	public static final Target URL = Target.the("INGRESA LA URL AL FORMULARIO")
			.located(By.xpath("//*[@id=\"url2\"]"));
	public static final Target DIGITOS = Target.the("INGRESA LOS DIGITOS AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"digits\"]"));
	public static final Target RANGO = Target.the("INGRESA EL RANGO AL FORMULARIO")
			.located(By.xpath("//*[@id=\"range\"]"));
	public static final Target CHECK = Target.the("SELECCIONA EL CHECK ")
			.located(By.xpath("//*[@id=\"agree2\"]"));
	public static final Target BOTON_VALIDAR = Target.the("BOTON DE VALIDACION ")
			.located(By.xpath("//*[@id=\"block-validate\"]/div[10]/input"));
	public static final Target MENSAJE_ERROR = Target.the("MENSAJE DE ERROR EN FORMULARIO")
			.located(By.xpath("//*[@class='help-block']"));
}
