package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {

    public static final Target BTN_HAZTE_UNA_CUENTA = Target.the("boton hazte una cuenta").locatedBy("//*[@id='b2indexPage']/header/nav[1]/div[2]/div[5]/a");
    public static final Target TXT_EMAIL = Target.the("Campo de correo electronico").located(By.id("username"));
    public static final Target BTN_CONTINUAR_EMAIL = Target.the("boton continuar con email").locatedBy("//*[@class='bui-button bui-button--large bui-button--wide']");
    public static final Target TXT_CLAVE = Target.the("Campo de clave").located(By.id("new_password"));
    public static final Target TXT_CONFIRMACION_CLAVE = Target.the("Confirmacion de clave").located(By.id("confirmed_password"));
    public static final Target BTN_CREAR_CUENTA = Target.the("boton crear cuenta").locatedBy("//*[@class='bui-button__text' and contains(text(),'Crear una cuenta')]");
    public static final Target MODAL_BIENVENIDA = Target.the("modal bienvenida").locatedBy("//header[@class='bui-modal__header']");
    public static final Target BTN_EMPEZAR = Target.the("boton para cerrar moda de bienvenida").locatedBy("//*[@class='bui-button__text' and contains(text(),'Empezar a buscar')]");

}


