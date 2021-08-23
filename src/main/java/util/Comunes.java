package util;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;

import static userinterface.MenusUI.*;

public class Comunes {

    public HashMap<String, Target>  menu() {
        HashMap<String, Target> menus = new HashMap<String,Target>();
        menus.put("CrearCuenta",BTN_HAZTE_UNA_CUENTA);
        menus.put("IniciarSesion",BTN_INICIAR_SESION);
        menus.put ("Turismo",BTN_TURISMO);
        menus.put("Vuelos",BTN_VUELOS);
        return menus;
    }

    public boolean buscarRegistroDatePicker(String xpath, String valor) {

        try{
            List<WebElement> elements = ThucydidesWebDriverSupport.getDriver().findElements(By.xpath(xpath));

            for (WebElement element: elements) {
                if(element.getText().equals(valor)) {
                    element.click();
                    return true;
                }
            }
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }
        return false;
    }
}
