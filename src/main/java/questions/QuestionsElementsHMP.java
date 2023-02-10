package questions;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import userinterfaces.ConfiguracionesPage;

public class QuestionsElementsHMP  {

	public static Question<String> validarTraduccion(){
		return actor -> TextContent.of(ConfiguracionesPage.LBL_INGLES).viewedBy(actor).asString();
	}
	
}
