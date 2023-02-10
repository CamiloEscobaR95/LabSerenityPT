@AllTest
Feature: Realizar pruebas sobre la funcionalidad
           como un nuevo  usuario
           ingresar a la web de serenity.is
           para realizar la validacion del funcionamiento del portal


Background:
    Given Un usuario ingresa a ala web de serenity
    

  @CP_001
  Scenario Outline: : Buscar un historial  de pedidos en la sesion Northwind por cliente
    When Hace login <user> <password>
    Then El usuario realiza la busqueda por cliente <customer>

    Examples: 
      | user  | password | customer            |
      | admin | serenity | Tortuga Restaurante |

  @CP_002
  Scenario Outline: Validar la tradución del idioma ingles al idioma español
    When Hace login <user> <password>
    Then El usuario pulsa el boton de traducir idioma <palabraComparacion>

    Examples: 
      | user  | password | palabraComparacion |
      | admin | serenity | Pedido            |

  @CP_003
  Scenario Outline: Crear un cliente nuevo en la sesion Northwind
    When Hace login <user> <password>
    When Se dirige a la sesion de Northwind y pulsa clientes
    Then El usuario crea un nuevo cliente <idCliente> <nombreEmpresa> <nombreDeContacto> <tituloContacto> <direccion> <pais> <ciudad> <telefono>

    Examples: 
      | user  | password | idCliente | nombreEmpresa | nombreDeContacto | tituloContacto | direccion  | pais      | ciudad      | telefono |
      | admin | serenity |      ABC | TesterSAS      | Camilo           | Automatizador  | avBAStreet | Argentina | BuenosAires |   201400 |

  @CP_004
  Scenario Outline: Agregar una tarea nueva en el HomePage
    When Hace login <user> <password>
    Then ingresa una nueva tarea en la session homePage <Tarea>

    Examples: 
      | user  | password | Tarea                            |
      | admin | serenity | Generar reporte de cierre de mes |
