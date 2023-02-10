package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import questions.QuestionsElementsHMP;
import questions.ValidarCreacionCliente;
import questions.ValidarTraduccion;
import tasks.clientes.CrearClienteNuevo;
import tasks.configuraciones.Idioma;
import tasks.homepage.IngresarNuevaTarea;
import tasks.menu.SeleccionarClientes;
import tasks.menu.SeleccionarPedidos;
import tasks.pedidos.BuscarListaPedidosCl;
import tasks.login.RealizarLogin;
import userinterfaces.LoginPage;
import userinterfaces.PedidosPage;
import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.hamcrest.Matcher;

public class FuncionalidadesStep {

	@Managed(driver = "chrome")
	WebDriver navegador;

	
	Actor usuario = new Actor("usuario");
	LoginPage loginPage = new LoginPage();
	PedidosPage pedidosPage = new PedidosPage();


	@Given("^Un usuario ingresa a ala web de serenity$")
	public void unUsuarioIngresaAAlaWebDeSerenity() {
		
		usuario.can(BrowseTheWeb.with(navegador));
		usuario.wasAbleTo(Open.browserOn(loginPage));
		navegador.manage().window().maximize();
		Serenity.setSessionVariable("driver").to(navegador);
		
	}

	@When("^Hace login (.*) (.*)$")
	public void haceLoginAdminserenity(String user, String password) {
		usuario.wasAbleTo(
				RealizarLogin.ingresarCredenciales(user, password)
		);
	}

	@Then("^El usuario realiza la busqueda por cliente (.*)$")
	public void elUsuarioRealizaLaBusquedaTortugaRestaurantePorCliente(String cliente) {
		usuario.wasAbleTo(
				SeleccionarPedidos.seleccionarPedidos(),
				BuscarListaPedidosCl.buscarHistorialPd(cliente)   
		);
		
		Assert.assertTrue(BuscarListaPedidosCl.lista);
		
	}
	
	@Then("^El usuario pulsa el boton de traducir idioma (.*)$")
	public void elUsuarioPulsaElBotonDeTraducirIdioma(String palabraDeComparacion) {
		usuario.wasAbleTo(
				Idioma.pulsarBtnTraducir()
				
		);
	
		
		usuario.should(seeThat(ValidarTraduccion.validarTraduccion(palabraDeComparacion), equalTo(palabraDeComparacion)));
		//usuario.should(seeThat("El resultado de la traduccion sera:", QuestionHMP.validarTraduccion(), equalTo(palabraDeComparacion)));
		
	}
	
	

	@Then("^ingresa una nueva tarea en la session homePage (.*)$")
	public void ingresaUnaNuevaTareaEnLaSessionHomePageGenerarReporteDeCierreDeMes(String tarea) {
		usuario.wasAbleTo(
				IngresarNuevaTarea.ingresarNuevaTarea(tarea)
				
		);
	}
	
	@When("^Se dirige a la sesion de Northwind y pulsa clientes$")
	public void seDirigeALaSesionDeNorthwindYPulsaClientes() {
	    usuario.wasAbleTo(
	    		SeleccionarClientes.seleccionarClientes()
				
		);
	}

	
	@Then("^El usuario crea un nuevo cliente (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
	public void elUsuarioCreaUnNuevoClienteCamiloEscobarAutomatizadorAvBAStreetArgentinaBuenosAires(String idCliente,
			String nombreEmpresa, String nombreContacto, String tituloContacto, String direccion, String pais, String ciudad, String telefono) {
		
		usuario.wasAbleTo(CrearClienteNuevo.crearCliente(idCliente, nombreEmpresa, nombreContacto, tituloContacto, direccion,pais, ciudad, telefono));
		usuario.should(seeThat(ValidarCreacionCliente.validarCreacion(idCliente), equalTo(true)));
		//Assert.assertTrue(CrearClienteNuevo.clienteCreado);
	}

	
}
