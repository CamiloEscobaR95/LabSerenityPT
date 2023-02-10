package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.ConfiguracionesPage;

public class ValidarTraduccion implements Question<String> {

	private String palabraDeComparacion;

	public ValidarTraduccion(String palabraDeComparacion) {
		super();
		this.palabraDeComparacion = palabraDeComparacion;
	}

	public static ValidarTraduccion validarTraduccion(String palabraDeComparacion) {
		
		return new ValidarTraduccion(palabraDeComparacion);
	}
	
	@Override
	public String answeredBy(Actor actor) {
		String resultadoPalabra = Text.of(ConfiguracionesPage.LBL_INGLES).viewedBy(actor).asString();
		if(palabraDeComparacion.equals(resultadoPalabra)) {
			System.out.println("La traducion fue exitosa");
			
		}else {
			System.out.println("Hubo un error en la traducción");
			System.out.println("TEST FAILED");
		}
		return resultadoPalabra;
	}
	
	

}
