package tasks.menu;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MenuPage.*;

public class SeleccionarClientes implements Task {

	@Override
	public <T extends Actor> void performAs(T usuario) {
		
		usuario.attemptsTo(
				Click.on(BTN_NORTHWIND),
				Click.on(BTN_CLIENTES)
				
				);
	}

	public static SeleccionarClientes seleccionarClientes() {
		
		return instrumented(SeleccionarClientes.class);
	}

	

}
