package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ToursUI extends PageObject {

    public static final Target TXT_BUSCAR_TOURS = Target.the("caja de texto para buscar").located(By.name("query"));
    public static final Target BTN_BUSCAR_TURISMO = Target.the("boton buscar turismo").locatedBy("//*[@class='Button-module__text___3l2y1' and contains(text(),'Buscar')]");
    public static final Target LIST_TOURS = Target.the("Lista encontrada").locatedBy("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");

}
