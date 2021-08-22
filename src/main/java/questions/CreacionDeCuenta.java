package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import util.enums.EnumGenerico;

import static userinterface.LoginUI.*;

public class CreacionDeCuenta implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(MODAL_BIENVENIDA.resolveFor(actor).isVisible()){
            actor.attemptsTo(Click.on(BTN_GENERICO_LOGIN.of(EnumGenerico.TEXTO_EMPEZAR_BUSCAR.getValue())));
            return true;
        }else{
            return false;
        }
    }

    public static CreacionDeCuenta exitosa(){
        return  new CreacionDeCuenta();
    }
}
