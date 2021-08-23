package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Esperar implements Interaction {

    private String tiempo;

    public Esperar(String tiempo){
        this.tiempo = tiempo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(Long.parseLong(tiempo + "000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Esperar por(String tiempo) {
        return Tasks.instrumented(Esperar.class, tiempo);
    }
}
