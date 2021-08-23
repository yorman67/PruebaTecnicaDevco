package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenusUI extends PageObject  {

    public static final Target BTN_INICIAR_SESION = Target.the("boton iniciar sesion").locatedBy("//*[@id='b2indexPage']/header/nav[1]/div[2]/div[6]/a");
    public static final Target BTN_HAZTE_UNA_CUENTA = Target.the("boton hazte una cuenta").locatedBy("//*[@id='b2indexPage']/header/nav[1]/div[2]/div[5]/a");
    public static final Target BTN_TURISMO = Target.the("boton de Turismo").locatedBy("//span[contains(text(),'Atracciones turísticas')]");
    public static final Target BTN_VUELOS = Target.the("boton de vuelos").locatedBy("//span[contains(text(),'Vuelos')]");

}
