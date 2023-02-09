package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ClientesPage extends PageObject { 
	
	public static final Target BTN_NVO_CLIENTE = Target.the("Boton para crear un cliente").located(By.xpath("//span[contains(text(), ' Nuevo Customer')]"));
	public static final Target BTN_GUARDAR = Target.the("Boton para guardar el cliente creado").located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));
	public static final Target INPUT_ID_CLIENTE = Target.the("Input para ingresar el id").located(By.xpath("//input[@name='CustomerID']"));
	public static final Target INPUT_NOM_EMPRESA = Target.the("Input para ingresar el id").located(By.xpath("//input[@name='CompanyName']"));
	public static final Target INPUT_NOM_CONTACTO = Target.the("Input para ingresar el nombreContc").located(By.xpath("//input[@name='ContactName']"));
	public static final Target INPUT_TITULO_CONTACTO = Target.the("Input para ingresar el tituloContc").located(By.xpath("//input[@name='ContactTitle']"));
	public static final Target INPUT_DIRECCION = Target.the("Input para ingresar al direccion").located(By.xpath("//input[@name='Address']"));
	public static final Target INPUT_BUSCAR_CLIENTE = Target.the("Input para buscar el cliente").located(By.xpath("//input[starts-with(@title,'introduzca el texto a buscar ...')]"));
	public static final Target ID_CLIENTE_CREADO = Target.the("Visualizacion id de cliente").located(By.xpath("//a[contains(text(),'ABC')]"));

}
