package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {


    public static final Target TXT_EMAIL = Target.the("Campo de correo electronico").located(By.id("username"));
    public static final Target BTN_GENERICO_LOGIN = Target.the("boton genericoi para las operaciones del login").locatedBy("//*[@class='bui-button__text' and contains(text(),'{0}')]");
    public static final Target TXT_NUEVA_CLAVE = Target.the("Campo de nueva clave").located(By.id("new_password"));
    public static final Target TXT_CLAVE = Target.the("Campo de clave").located(By.id("password"));
    public static final Target TXT_CONFIRMACION_CLAVE = Target.the("Confirmacion de clave").located(By.id("confirmed_password"));
    public static final Target MODAL_BIENVENIDA = Target.the("modal bienvenida").locatedBy("//header[@class='bui-modal__header']");
    public static final Target VERIFICACION_LOGIN = Target.the("Verificacion de logueo").located(By.id("profile-menu-trigger--title"));
}


