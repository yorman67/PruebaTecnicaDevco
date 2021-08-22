package task;

import util.GenerarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import util.enums.EnumGenerico;
import util.enums.EnumVariablesSesion;

import static userinterface.LoginUI.*;

public class CrearCuenta implements Task {

    GenerarData data = new GenerarData();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(data.crearCorreo()).into(TXT_EMAIL),
                Click.on(BTN_GENERICO_LOGIN.of(EnumGenerico.TEXTO_CONTINUAR_EMAIL.getValue()))
        );
        actor.remember("Clave",data.crearClave());
        actor.attemptsTo(
                Enter.theValue(actor.recall(EnumVariablesSesion.CLAVE.getValue()).toString()).into(TXT_NUEVA_CLAVE),
                Enter.theValue(actor.recall(EnumVariablesSesion.CLAVE.getValue()).toString()).into(TXT_CONFIRMACION_CLAVE),
                Click.on(BTN_GENERICO_LOGIN.of(EnumGenerico.TEXTO_CREAR_CUENTA.getValue()))
        );
    }

    public static CrearCuenta nueva () {
        return Tasks.instrumented(CrearCuenta.class);
    }
}
