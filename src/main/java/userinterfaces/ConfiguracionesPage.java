package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConfiguracionesPage extends PageObject {

	public static final Target BTN_TRADUCIR = Target.the("Boton de traduccion").located(By.xpath("//div[@class='dropdown dropend']//a//i[@class='s-sidebar-band-icon fa fa-language']"));
	public static final Target BTN_ESPAÑOL = Target.the("Boton de traduccion al español").located(By.xpath("//ul[@class='dropdown-menu s-language-selection-menu show']//li[9]//a"));
	public static final By LBL_INGLES = By.xpath("//ul[@class='nav nav-tabs']//li//h3");
}
