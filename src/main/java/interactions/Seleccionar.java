package interactions;

import util.Comunes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Interaction {

    Comunes comunes = new Comunes();

    private String opcion;

    public Seleccionar(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(comunes.menu().get(opcion))
        );
    }

    public static Performable opcion (String opcion){
        return Tasks.instrumented(Seleccionar.class,opcion);
    }
}
