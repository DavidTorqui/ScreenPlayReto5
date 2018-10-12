package ScreenPlay.Reto5.Tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import ScreenPlay.Reto5.Interactions.Esperar10;
import ScreenPlay.Reto5.Interactions.Esperar5;
import ScreenPlay.Reto5.Model.Registrarurl;
import ScreenPlay.Reto5.Util.ExcelReader;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class ValidarBusqueda implements Task{
	
	private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
    public String parentWindow, strPage;
    
    private List<Registrarurl> registrarurl;
    
    public ValidarBusqueda(List<Registrarurl> registrarurl) {
		this.registrarurl = registrarurl;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
            ExcelReader.crearLibroYHoja("C:\\Users\\czuluagag\\Desktop\\Results2.xlsx", "Results2");
        } catch (IOException e1) {
           e1.printStackTrace();
        }
		
		parentWindow= driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		List<String> urlencontrada = new ArrayList<String>();
		 
		int i = 10; 
		int j = 10;
		int o = 4;
		try {
			ExcelReader.setExcelFile("C:\\Users\\atorresq\\Desktop\\Results2.xlsx", "Results2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		 	
		for(String curWindow : allWindows){
				driver.switchTo().window(curWindow);
	            strPage = driver.getCurrentUrl();
	            System.out.println(strPage);
	            if(strPage.equals(registrarurl.get(i).getBanco())) {
	            	urlencontrada.add(strPage);
	            	 try {
	            		 	System.out.println("Lista Guardada " + registrarurl.get(j).getBanco());
	            		 	ExcelReader.escribeInfoEnExcel2("C:\\Users\\atorresq\\Desktop\\Results2.xlsx", "Results2",  strPage, 2, o);
	  	           	 }
	            	 catch (IOException e) {
	                       e.printStackTrace();
	                 }
	            	 actor.attemptsTo(Esperar5.aMoment());
	            	 j = j- 1;
	            	 o = o+ 1;
	            }
	     i = i - 1; 
	     actor.attemptsTo(Esperar10.aMoment());    
	     }
	}

	public static ValidarBusqueda comparar(List<Registrarurl> lista) {
		return Tasks.instrumented(ValidarBusqueda.class, lista);
	}
}