package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlquilerUI extends PageObject {

    public static final Target INPUT_LUGAR_RECOGIDA = Target.the("Indicar lugar recogida del vehiculo").located(By.name("ss_origin"));
    public static final Target BTN_BUSCAR_COCHE = Target.the("Buscar vehiculo").locatedBy("//*[@class='sb-searchbox__button ']");
    public static final Target BTN_MOSTRAR_COCHE = Target.the("Mostrar coches").locatedBy("//*[@class='result__bui-btn result__bui-btn--primary']");
    public static final Target BTN_ELEGIR_COCHE = Target.the("Seleccioanr Coche").locatedBy("//*[@class='bui-button bui-button--primary bui-button--large bui-button--wide bui-u-pull-end']");
    public static final Target BTN_RESERVAR = Target.the("Seleccionar boton de reserva").locatedBy("//*[@class='bui-button bui-button--secondary bui-button--large cdb__button-seperation']");




}
