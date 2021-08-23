package stepdefinitions;

import interactions.Seleccionar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;;
import questions.Posible;
import task.BuscarCoche;
import task.Reservar;
import util.enums.EnumMenu;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AlquilerCocheStepDefinition {

    @Dado("que el ususrio se encuentra en el menu de alquiler de coches")
    public void queElUsusrioSeEncuentraEnElMenuDeAlquilerDeCoches() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.opcion(EnumMenu.ALQUILER_COCHES.getValue()));
    }

    @Cuando("el usuario indica el lugar y fecha de recogida")
    public void elUsuarioIndicaElLugarYFechaDeRecogida() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarCoche.en());
    }

    @Y("selecciona un registro de los que aparece")
    public void seleccionaUnRegistroDeLosQueAparece() {
        OnStage.theActorInTheSpotlight().attemptsTo(Reservar.coche());
    }

    @Entonces("Verifica que la pagina le permita reservar")
    public void verificaQueLaPaginaLePermitaReservar() {
        OnStage.theActorInTheSpotlight().should(seeThat(Posible.reserva()));
    }
}
