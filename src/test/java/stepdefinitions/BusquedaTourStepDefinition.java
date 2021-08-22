package stepdefinitions;

import interactions.Seleccionar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Listas;
import task.BuscarTours;
import util.enums.EnumMenu;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BusquedaTourStepDefinition {


    @Dado("que el usuario se encuentra en el menu de atracciones turisticas")
    public void queElUsuarioSeEncuentraEnElMenuDeAtraccionesTuristicas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.opcion(EnumMenu.TURISMO.getValue()));
    }

    @Cuando("el usaurio ingresa el nombre de la cidudad en la que se encuentra")
    public void elUsaurioIngresaElNombreDeLaCidudadEnLaQueSeEncuentra() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarTours.en("Panama"));
    }

    @Entonces("el usuario verifica que aparezca una lista de tours y actividades")
    public void elUsuarioVerificaQueAparezcaUnaListaDeToursYActividades() {
        OnStage.theActorInTheSpotlight().should(seeThat(Listas.encontradas()));
    }

}
