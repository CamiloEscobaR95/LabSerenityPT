package questions;

import static userinterfaces.ClientesPage.INPUT_BUSCAR_CLIENTE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.ClientesPage;

public class ValidarCreacionCliente implements Question<Boolean> {
	private static String idCliente;
	private static Boolean respuesta = false;
	
	
	
	public ValidarCreacionCliente(String idCliente, Boolean respuesta) {
		super();
		this.idCliente = idCliente;
		this.respuesta = respuesta;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		if(Visibility.of(ClientesPage.INPUT_BUSCAR_CLIENTE).viewedBy(actor).asBoolean()) {
			actor.attemptsTo(Enter.theValue(idCliente).into(INPUT_BUSCAR_CLIENTE));
			if(Visibility.of(ClientesPage.ID_CLIENTE_CREADO).viewedBy(actor).asBoolean()) {
				System.out.println("Cliente creado exitosamente!");
				respuesta = true;
			}
			
		}else {
			System.out.println("hubo un error en la creacion del cliente");
			respuesta = false;
		}
		return respuesta;
	}

	public static ValidarCreacionCliente validarCreacion(String idCliente) {
		
		return new ValidarCreacionCliente(idCliente, respuesta);
	}

}
