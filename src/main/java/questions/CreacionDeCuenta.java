package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.Login.BTN_EMPEZAR;
import static userinterface.Login.MODAL_BIENVENIDA;

public class CreacionDeCuenta implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(MODAL_BIENVENIDA.resolveFor(actor).isVisible()){
            actor.attemptsTo(Click.on(BTN_EMPEZAR));
            return true;
        }else{
            return false;
        }
    }

    public static CreacionDeCuenta exitosa(){
        return  new CreacionDeCuenta();
    }
}
