package tasks.login;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.LoginPage.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarLogin implements Task {
	
	private String user;
	private String password;

	WebDriver driver = Serenity.sessionVariableCalled("driver");
	public RealizarLogin(String user, String password) {
		this.user = user;
		this.password = password;
	}

	@Override
	public <T extends Actor> void performAs(T usuario) {
		
		usuario.attemptsTo(
				Enter.theValue(user).into(INPUT_USER),
				Enter.theValue(password).into(INPUT_PASS),
				Click.on(BTN_SING_IN)
				
				);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ; 
		
	}

	public static RealizarLogin ingresarCredenciales(String user, String password) {
		
		return instrumented(RealizarLogin.class, user, password);
	}
	


}
