package tasks.configuraciones;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ConfiguracionesPage.*;



public class Idioma implements Task {
	
	private String palabraDeComparacion;
	public static Boolean traduccion = false;

	public Idioma(String palabraDeComparacion) {
		super();
		this.palabraDeComparacion = palabraDeComparacion;
	}

	@Override
	public <T extends Actor> void performAs(T usuario) {
		
		usuario.attemptsTo(
				Click.on(BTN_TRADUCIR),
				Click.on(BTN_ESPAÑOL)
				);
		try {
			if(Visibility.of(LBL_INGLES).viewedBy(usuario).asBoolean()) {
				String palabraTraducida = BrowseTheWeb.as(usuario).find(LBL_INGLES).getText();
				
				if(palabraTraducida.contentEquals(palabraDeComparacion)) {
					traduccion = true;
					System.out.println("La traduccion al idioma español fue exitosa!");
					System.out.println("TEST PASSED");
				}else {
					traduccion = true;
					System.out.println("La traduccion al idioma español fue fallida!");
					System.out.println("TEST FAILED");
				}
			}
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		
	 
		
	}

	public static Idioma pulsarBtnTraducir(String palabraDeComparacion) {

		return instrumented(Idioma.class, palabraDeComparacion);
	}

}
