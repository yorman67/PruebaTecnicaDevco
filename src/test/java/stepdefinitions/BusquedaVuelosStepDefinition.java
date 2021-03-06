package stepdefinitions;

import interactions.Seleccionar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Vuelos;
import task.BuscarVuelos;
import util.enums.EnumMenu;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BusquedaVuelosStepDefinition {

    @Dado("que el usuario se encuentra en el menu de vuelos")
    public void queElUsuarioSeEncuentraEnElMenuDeVuelos() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.opcion(EnumMenu.VUELOS.getValue()));
    }

    @Cuando("El usaurio ingresa el {string} y {string} con fechas {string} {string}")
    public void elUsaurioIngresaElYConFechas(String lugarSalida, String lugarDestino, String fechaSalida, String fechaDestino) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarVuelos.con(lugarSalida,lugarDestino,fechaSalida,fechaDestino));
    }

    @Entonces("el ususario verifica que aparezcan los vuelos con los filtros solicitados")
    public void elUsusarioVerificaQueAparezcanLosVuelosConLosFiltrosSolicitados() {
        OnStage.theActorInTheSpotlight().should(seeThat(Vuelos.encontrados()));
    }

}
