package userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PedidosPage extends PageObject {
	
	WebDriver driver = Serenity.sessionVariableCalled("driver");
	
	public static final Target INPUT_BUSCAR = Target.the("input de busqueda").locatedBy("//div[@class='s-QuickSearchBar']//input");  
	public static final Target RESUL_BUSQUE = Target.the("resultados de busqueda").locatedBy("//div[2]//a[contains(text(),'{0}')]");
	public static final By LISTA_PEDIDO = By.xpath("//div[@class='grid-canvas']");
	
}
