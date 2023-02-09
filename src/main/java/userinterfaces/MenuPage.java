package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage extends PageObject{

	public static final Target BTN_CASITA = Target.the("Boton home del Hashborad").located(By.className("s-sidebar-band-icon fa fa-home"));
	public static final Target BTN_NORTHWIND = Target.the("Boton Northwind del Hashborad").locatedBy("//span[contains(text(),'Northwind')]");
	public static final Target BTN_PEDIDOS = Target.the("Boton products del Hashborad").locatedBy("//ul[@id='nav_menu1_2_1']//span[contains(text(),'Orders')]");
	public static final Target BTN_CLIENTES = Target.the("Boton clientes del Hashborad").locatedBy("//ul[@id='nav_menu1_2_1']//span[contains(text(),'Customers')]");
}
