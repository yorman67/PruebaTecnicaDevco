package stepdefinitions;

import interactions.Seleccionar;
import questions.CreacionDeCuenta;
import task.CrearCuenta;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import util.enums.EnumMenu;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreacionCuentaNuevaStepDefinition {

    @Dado("^que el usuario se encuentra en la pagina de creacion de cuenta$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeCreacionDeCuenta() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.opcion(EnumMenu.CREARCUENTA.getValue()));
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
