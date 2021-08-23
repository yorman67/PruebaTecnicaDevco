package task;

import interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static userinterface.AlquilerUI.*;

public class BuscarCoche implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Medellin").into(INPUT_LUGAR_RECOGIDA),
                Esperar.por("10"),
                Hit.the(Keys.DOWN).into(INPUT_LUGAR_RECOGIDA),
                Hit.the(Keys.ENTER).into(INPUT_LUGAR_RECOGIDA),
                Click.on(BTN_BUSCAR_COCHE),
                Click.on(BTN_MOSTRAR_COCHE)
        );


    }

    public static BuscarCoche en() {
        return Tasks.instrumented(BuscarCoche.class);
    }
}
