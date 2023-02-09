package tasks.pedidos;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Visibility;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.PedidosPage.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscarListaPedidosCl implements Task {

	WebDriver driver = Serenity.sessionVariableCalled("driver");
	private String cliente;
	public static Boolean lista = false;

	public BuscarListaPedidosCl(String cliente) {
		this.cliente = cliente;
	}
	

	@Override
	public <T extends Actor> void performAs(T usuario) {
		
		usuario.attemptsTo(Enter.theValue(cliente).into(INPUT_BUSCAR),
				Hit.the(Keys.ENTER).into(INPUT_BUSCAR)
				);
		
		WebDriverWait wait = new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LISTA_PEDIDO));
		
		try {
			if (Visibility.of(LISTA_PEDIDO).viewedBy(usuario).asBoolean()) {
				System.out.println("TEST PASSED");
				lista = true;
			} else {
				System.out.println("TEST FAILED");
				lista = false;
			}
		} catch (Exception e) {
			System.out.println("Error en la session de lista de pedidos");
		}
		
	}

	public static BuscarListaPedidosCl buscarHistorialPd(String cliente) {

		return instrumented(BuscarListaPedidosCl.class, cliente);
	}

}
