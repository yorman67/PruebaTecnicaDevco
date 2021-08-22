package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.ToursUI.LIST_TOURS;

public class Listas implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LIST_TOURS.resolveFor(actor).isVisible();
    }

    public static Listas encontradas(){
        return  new Listas();
    }
}
