package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import util.enums.EnumGenerico;
import util.enums.EnumVariablesSistema;

import static userinterface.Login.*;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(System.getenv(EnumVariablesSistema.USUARIOlOGIN.getValue())).into(TXT_EMAIL),
                Click.on(BTN_GENERICO_LOGIN.of(EnumGenerico.TEXTO_CONTINUAR_EMAIL.getValue())),
                Enter.theValue(System.getenv(EnumVariablesSistema.CLAVELOGIN.getValue())).into(TXT_CLAVE),
                Click.on(BTN_GENERICO_LOGIN.of(EnumGenerico.TEXTO_INICIAR_SESION.getValue()))
        );
    }

    public static  Login correcto() {
        return Tasks.instrumented(Login.class);
    }
}
