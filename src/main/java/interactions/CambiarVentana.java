package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CambiarVentana  implements Interaction {

    @Override
    public <T extends Actor> void performAs(T t) {
        String window_one = getDriver().getWindowHandle();
        Set<String> allWindow = getDriver().getWindowHandles();
        for (String i : allWindow) {
            if (i != window_one) {
                getDriver().switchTo().window(i);
            }
        }
    }

    public static CambiarVentana exitoso(){
        return Tasks.instrumented(CambiarVentana.class);
    }
}
