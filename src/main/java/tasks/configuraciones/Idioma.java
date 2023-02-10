package tasks.configuraciones;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ConfiguracionesPage.*;



public class Idioma implements Task {
	
	
	@Override
	public <T extends Actor> void performAs(T usuario) {
		
		usuario.attemptsTo(
				Click.on(BTN_TRADUCIR),
				Click.on(BTN_ESPAÑOL)
				);
	}

	public static Idioma pulsarBtnTraducir() {

		return instrumented(Idioma.class);
	}

}
