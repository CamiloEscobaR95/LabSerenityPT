package tasks.homepage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePagePage.*;
import org.openqa.selenium.*;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import utilidades.Utilidades;



public class IngresarNuevaTarea implements Task {
	
	private String tarea;
	
	public IngresarNuevaTarea(String tarea) {
		super();
		this.tarea = tarea;
	}

	@Override
	public <T extends Actor> void performAs(T usuario) {

		Utilidades.scrollDownFull();
		usuario.attemptsTo(
				Enter.theValue(tarea).into(INPUT_TAREA),
				Hit.the(Keys.ENTER).into(BTN_ADD)
				);		
	}

	public static IngresarNuevaTarea ingresarNuevaTarea(String tarea) {
	
	  return instrumented(IngresarNuevaTarea.class, tarea);
	}

}
