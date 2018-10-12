package ScreenPlay.Reto5.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.paginasamarillas.com.co/")
public class Ingresopagina extends PageObject {
	
	public static final Target INGRESAR_PALABRA = Target.the("INGRESA EN EL CAMPO DE BUSQUEDA")
			.located(By.xpath("//*[@id=\"keyword\"]"));
	
	public static final Target INGRESAR_UBICACION = Target.the("INGRESA EN EL CAMPO UBICACION")
			.located(By.xpath("//*[@id=\"locality\"]"));
	
	public static final Target CLICK_EN_BUSCAR = Target.the("DA CLICK EN EL BOTON BUSCAR")
			.located(By.xpath("//*[@id=\"buscar\"]"));
	
	public static final Target BANCO_1 = Target.the("SELECCIONA EL LINK DEL PRIMER BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_2 = Target.the("SELECCIONA EL LINK DEL SEGUNDO BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_3 = Target.the("SELECCIONA EL LINK DEL TERCER BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_4 = Target.the("SELECCIONA EL LINK DEL CUARTO BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[4]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_5 = Target.the("SELECCIONA EL LINK DEL QUINTO BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[5]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_6 = Target.the("SELECCIONA EL LINK DEL SEXTO BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[6]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_7 = Target.the("SELECCIONA EL LINK DEL SEPTIMO BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[7]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_8 = Target.the("SELECCIONA EL LINK DEL OCTAVO BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[8]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_9 = Target.the("SELECCIONA EL LINK DEL NOVENO BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[9]/div/div[1]/div[2]/div[2]/div[2]/a"));
	
	public static final Target BANCO_10= Target.the("SELECCIONA EL LINK DEL DECIMO BANCO")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[11]/div/div[1]/div[2]/div[2]/div[2]/a"));
}
