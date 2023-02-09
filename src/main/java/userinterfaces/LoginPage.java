package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://serenity.is/demo/")
public class LoginPage extends PageObject {

	public static final Target INPUT_USER = Target.the("Input donde se ingresa el nombre de usuario").located(By.id("LoginPanel0_Username"));
	public static final Target INPUT_PASS = Target.the("Input donde se ingresa la contraseña").located(By.id("LoginPanel0_Password"));
	public static final Target BTN_SING_IN = Target.the("Boton de login").located(By.id("LoginPanel0_LoginButton"));
	
}
