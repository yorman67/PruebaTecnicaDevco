package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class VuelosUI extends PageObject {


    public static final Target TXT_ORIGEN_VUELO = Target.the("caja de texto para buscar origen de veuelo").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static final Target TXT_ORIGEN_VUELO2 = Target.the("caja de texto para buscar origen de veuelo").locatedBy("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public static final Target TXT_DESTINO_VUELO = Target.the("caja de texto para buscar destino de veuelo").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static final Target TXT_DESTINO_VUELO2 = Target.the("caja de texto para buscar destino de veuelo").locatedBy("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public static final Target FECHA_SALIDA = Target.the("abrir opcion de fecha de salida").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static final Target FECHA_SALIDA2 = Target.the("Seleccionar fecha de salida").locatedBy("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]");
    public static final Target FECHA_REGRESO = Target.the("abrir opcion de fehca de regreso").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[1]");
    public static final Target FECHA_REGRESO2 = Target.the("Seleccionar fecha de regreso").locatedBy("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]");
    public static final Target BTN_BUSCAR_VUELOS = Target.the("btn buscar vuelos").locatedBy("//*[@class='Common-Widgets-Button-StyleJamButton theme-light Button-Gradient ui-button size-l searchButton _id7 _ihr _ihs _h-Y _im4 _ii0 _ihp _ihq _inw _iir _iae _jWT _iFQ _iFR _imQ _iv1']");
    public static final Target LISTA_VUELOS = Target.the("btn buscar vuelos mas barato").located(By.id("searchResultsList"));


}
