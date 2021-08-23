package task;

import interactions.CambiarVentana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.AlquilerUI.*;

public class Reservar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ELEGIR_COCHE),
                CambiarVentana.exitoso()
        );
    }

    public static  Reservar coche(){
        return Tasks.instrumented(Reservar.class);
    }
}
