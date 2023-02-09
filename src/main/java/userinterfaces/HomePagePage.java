package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePagePage extends PageObject {
 
	public static final Target INPUT_TAREA = Target.the("Input donde se añade una tarea").located(By.xpath("//div[@class='input-group']//input[@placeholder='type another task']"));
	public static final Target BTN_ADD = Target.the("Boton donde se añade una tarea").located(By.xpath("//button[contains(text(),'Add')]"));
	public static final Target TAREA_OK = Target.the("Tarea despues de ser agregada").located(By.xpath("//span[contains(text(),'{0}')]"));
}
