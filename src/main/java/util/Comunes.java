package util;

import net.serenitybdd.screenplay.targets.Target;
import java.util.HashMap;

import static userinterface.MenusUI.*;

public class Comunes {

    public HashMap<String, Target>  menu() {
        HashMap<String, Target> menus = new HashMap<String,Target>();
        menus.put("CrearCuenta",BTN_HAZTE_UNA_CUENTA);
        menus.put("IniciarSesion",BTN_INICIAR_SESION);
        menus.put ("Turismo",BTN_TURISMO);
        menus.put("Vuelos",BTN_VUELOS);
        menus.put("alquiler",BTN_COCHES);
        return menus;
    }
}
