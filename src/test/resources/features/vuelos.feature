#language:  es

Característica: Verificar el funcionamiento del mudulo de vuelos
  Como usuario de la aplicacion
  Quiero buscar vuelos en las diferentes clases economicas
  Para escojer la opcion que mas se acomode a mi

  Antecedentes:
    Dado que el usuario se enceuntra en la pagina de booking

  Esquema del escenario: Busqueda de vuelo <NombreEscenario>
    Dado que el usuario se encuentra en el menu de vuelos
    Cuando El usaurio ingresa el "<LugarSalida>" y "<LugarDestino>" con fechas "<FechaSalida>" "<FechaRegreso>"
    Entonces el ususario verifica que aparezcan los vuelos con los filtros solicitados
    Ejemplos:
      |NombreEscenario                     |LugarSalida   |LugarDestino  | FechaSalida | FechaRegreso|
      |vuelo ida y vueltya adulto          |    Bogota    |   Mexico     | 10/10/2021 |  20/11/2021  |