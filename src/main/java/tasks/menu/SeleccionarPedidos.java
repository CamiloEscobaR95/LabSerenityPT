package tasks.menu;


import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MenuPage.*;

public class SeleccionarPedidos implements Task {
	
	@Override
	public <T extends Actor> void performAs(T usuario) {
		
		usuario.attemptsTo(
				Click.on(BTN_NORTHWIND),
				Click.on(BTN_PEDIDOS)
				
				);
	}

	public static SeleccionarPedidos seleccionarPedidos() {
		
		return instrumented(SeleccionarPedidos.class);
	}
	
	
}
