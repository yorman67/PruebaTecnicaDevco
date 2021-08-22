package stepdefinitions;

import interactions.AbrirNavegador;
import interactions.Seleccionar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.CreacionDeCuenta;
import task.Login;
import util.Constantes;
import util.enums.EnumMenu;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @Dado("^que el (.*) se enceuntra en la pagina de booking$")
    public void queElUsuarioSeEnceuntraEnLaPaginaDeBooking(String strActor) {
        OnStage.theActorCalled(strActor).attemptsTo(AbrirNavegador.en(Constantes.URL_APLICAIVO));
    }

    @Cuando("el usuario ingresa correo y clave")
    public void elUsuarioIngresaCorreoYClave() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.opcion(EnumMenu.INICIARSESION.getValue()));
        OnStage.theActorInTheSpotlight().attemptsTo(Login.correcto());
    }

    @Entonces("se valida que aparezca la pantalla correspondiente")
    public void seValidaQueAparezcaLaPantallaCorrespondiente() {
        OnStage.theActorInTheSpotlight().should(seeThat(questions.Login.exitoso()));
    }
}
