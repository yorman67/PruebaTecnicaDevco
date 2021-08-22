package util;

import net.serenitybdd.screenplay.targets.Target;
import java.util.HashMap;

import static userinterface.Login.BTN_HAZTE_UNA_CUENTA;
import static userinterface.Login.BTN_INICIAR_SESION;

public class Comunes {

    public HashMap<String, Target>  menu() {
        HashMap<String, Target> menus = new HashMap<String,Target>();
        menus.put("CrearCuenta",BTN_HAZTE_UNA_CUENTA);
        menus.put("IniciarSesion",BTN_INICIAR_SESION);
        return menus;
    }
}
