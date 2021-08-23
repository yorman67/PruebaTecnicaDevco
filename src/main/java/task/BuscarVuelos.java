package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static userinterface.VuelosUI.*;

public class BuscarVuelos  implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_ORIGEN_VUELO),
                Enter.theValue("Bogota").into(TXT_ORIGEN_VUELO2),
                Hit.the(Keys.ENTER).into(TXT_ORIGEN_VUELO2),
                Click.on(TXT_DESTINO_VUELO),
                Enter.theValue("Mexico").into(TXT_DESTINO_VUELO2),
                Hit.the(Keys.ENTER).into(TXT_DESTINO_VUELO2),
                Click.on(FECHA_SALIDA),
                Enter.theValue("10/10/2021").into(FECHA_SALIDA2),
                Hit.the(Keys.ENTER).into(FECHA_SALIDA2),
                Click.on(FECHA_REGRESO),
                Enter.theValue("10/12/2021").into(FECHA_REGRESO2),
                Hit.the(Keys.ENTER).into(FECHA_REGRESO2),
                Click.on(BTN_BUSCAR_VUELOS)
        );
    }

    public static BuscarVuelos con () {
        return Tasks.instrumented(BuscarVuelos.class);
    }
}
