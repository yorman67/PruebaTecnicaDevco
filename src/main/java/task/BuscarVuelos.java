package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static userinterface.VuelosUI.*;

public class BuscarVuelos  implements Task {

    private String lugarSalida;
    private String luagrDestino;
    private String fechaSalida;
    private String fechaRegreso;

    public BuscarVuelos(String lugarSalida, String luagrDestino, String fechaSalida, String fechaRegreso) {
        this.lugarSalida = lugarSalida;
        this.luagrDestino = luagrDestino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TXT_ORIGEN_VUELO),
                Enter.theValue(lugarSalida).into(TXT_ORIGEN_VUELO2),
                Hit.the(Keys.ENTER).into(TXT_ORIGEN_VUELO2),
                Click.on(TXT_DESTINO_VUELO),
                Enter.theValue(luagrDestino).into(TXT_DESTINO_VUELO2),
                Hit.the(Keys.ENTER).into(TXT_DESTINO_VUELO2),
                Click.on(FECHA_SALIDA),
                Enter.theValue(fechaSalida).into(FECHA_SALIDA2),
                Hit.the(Keys.ENTER).into(FECHA_SALIDA2),
                Click.on(FECHA_REGRESO),
                Enter.theValue(fechaRegreso).into(FECHA_REGRESO2),
                Hit.the(Keys.ENTER).into(FECHA_REGRESO2),
                Click.on(BTN_BUSCAR_VUELOS)
        );
    }

    public static BuscarVuelos con (String lugarSalida,String lugarDestino, String fechaSalida,String fechaRegreso) {
        return Tasks.instrumented(BuscarVuelos.class,lugarSalida,lugarDestino,fechaSalida,fechaRegreso);
    }
}
