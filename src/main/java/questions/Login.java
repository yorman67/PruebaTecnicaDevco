package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.Login.VERIFICACION_LOGIN;

public class Login  implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return VERIFICACION_LOGIN.resolveFor(actor).isVisible();
    }

    public static Login exitoso() {
        return  new Login();
    }
}
