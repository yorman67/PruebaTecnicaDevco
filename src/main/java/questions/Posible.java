package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.AlquilerUI.BTN_RESERVAR;

public class Posible implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_RESERVAR.resolveFor(actor).isVisible() && BTN_RESERVAR.resolveFor(actor).isClickable();
    }

    public static Posible reserva () {
        return  new Posible();
    }
}
