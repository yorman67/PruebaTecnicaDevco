package task;

import util.GenerarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static userinterface.Login.*;

public class CrearCuenta implements Task {

    GenerarData data = new GenerarData();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(data.crearCorreo()).into(TXT_EMAIL),
                Click.on(BTN_CONTINUAR_EMAIL)
        );
        actor.remember("Clave",data.crearClave());
        actor.attemptsTo(
                Enter.theValue(actor.recall("Clave").toString()).into(TXT_CLAVE),
                Enter.theValue(actor.recall("Clave").toString()).into(TXT_CONFIRMACION_CLAVE),
                Click.on(BTN_CREAR_CUENTA)
        );
    }

    public static CrearCuenta nueva () {
        return Tasks.instrumented(CrearCuenta.class);
    }
}
