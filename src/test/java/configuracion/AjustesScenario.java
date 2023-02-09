package configuracion;
import org.junit.Before;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AjustesScenario {
	
	@Before
	public void ajustesScenario() {
		OnStage.setTheStage(new OnlineCast());
	}

}
