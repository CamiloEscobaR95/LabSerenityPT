package tasks.clientes;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ClientesPage.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;



public class CrearClienteNuevo implements Task {
	
	private String idCliente, nombreEmpresa, nombreContacto, tituloContacto, direccion;
	public static Boolean clienteCreado = false;

	public CrearClienteNuevo(String idCliente, String nombreEmpresa, String nombreContacto, String tituloContacto,
			String direccion, String pais, String ciudad, String telefono) {
		super();
		this.idCliente = idCliente;
		this.nombreEmpresa = nombreEmpresa;
		this.nombreContacto = nombreContacto;
		this.tituloContacto = tituloContacto;
		this.direccion = direccion;

	}

	@Override
	public <T extends Actor> void performAs(T usuario) {
		usuario.attemptsTo(
				Click.on(BTN_NVO_CLIENTE),
				Enter.theValue(idCliente).into(INPUT_ID_CLIENTE),
				Enter.theValue(nombreEmpresa).into(INPUT_NOM_EMPRESA),
				Enter.theValue(nombreContacto).into(INPUT_NOM_CONTACTO),
				Enter.theValue(tituloContacto).into(INPUT_TITULO_CONTACTO),
				Enter.theValue(direccion).into(INPUT_DIRECCION),
				
				Click.on(BTN_GUARDAR),
				Enter.theValue(idCliente).into(INPUT_BUSCAR_CLIENTE)
				
				);
		
		if(Visibility.of(ID_CLIENTE_CREADO).viewedBy(usuario).asBoolean()) {
		System.out.println("Cliente creado con exito!");
		System.out.println("TEST PASSED");
		clienteCreado = true;
		}else {
			System.out.println("El cliente no pudo ser creado.");
			System.out.println("TEST FAILED");
			clienteCreado = false;
		}
		
	}

	public static CrearClienteNuevo crearCliente(String idCliente, String nombreEmpresa, String nombreContacto,
			String tituloContacto, String direccion, String pais, String ciudad, String telefono) {
			
		return instrumented(CrearClienteNuevo.class, idCliente, nombreEmpresa, nombreContacto, tituloContacto, direccion, pais, ciudad, telefono);
	}

}
