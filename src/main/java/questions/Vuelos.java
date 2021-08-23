package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.VuelosUI.LISTA_VUELOS;

public class Vuelos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LISTA_VUELOS.resolveFor(actor).isVisible();
    }

    public  static  Vuelos encontrados(){
        return  new Vuelos();
    }
}
