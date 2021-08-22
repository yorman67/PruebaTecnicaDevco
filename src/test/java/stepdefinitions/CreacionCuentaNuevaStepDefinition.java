package stepdefinitions;

import interactions.AbrirNavegador;
import interactions.Seleccionar;
import questions.CreacionDeCuenta;
import task.CrearCuenta;
import util.Constantes;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreacionCuentaNuevaStepDefinition {

    @Dado("^que el (.*) se enceuntra en la pagina de booking$")
    public void queElUsuarioSeEnceuntraEnLaPaginaDeBooking(String strActor) {
        OnStage.theActorCalled(strActor).attemptsTo(AbrirNavegador.en(Constantes.URL_APLICAIVO));
    }

    @Dado("^que el usuario se encuentra en la pagina de creacion de cuenta$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeCreacionDeCuenta() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.opcion("CrearCuenta"));
    }

    @Cuando("el usuario ingresa correo y clave correctos")
    public void elUsuarioIngresaCorreoYClaveCorrectos() {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearCuenta.nueva());
    }

    @Entonces("Se verifica que la cuenta se creo de manera correcta")
    public void seVerificaQueLaCuentaSeCreoDeManeraCorrecta() {
        OnStage.theActorInTheSpotlight().should(seeThat(CreacionDeCuenta.exitosa()));
    }

}
