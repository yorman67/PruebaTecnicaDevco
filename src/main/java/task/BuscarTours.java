package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.ToursUI.BTN_BUSCAR_TURISMO;
import static userinterface.ToursUI.TXT_BUSCAR_TOURS;

public class BuscarTours implements Task {

    private String lugar;

    public BuscarTours(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_BUSCAR_TOURS),
                Enter.theValue(lugar).into(TXT_BUSCAR_TOURS),
                Click.on(BTN_BUSCAR_TURISMO)
        );
    }

    public static BuscarTours en (String lugar) {
        return Tasks.instrumented(BuscarTours.class,lugar);
    }
}
