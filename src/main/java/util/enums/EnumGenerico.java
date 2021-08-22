package util.enums;

public enum EnumGenerico {

    TEXTO_CONTINUAR_EMAIL ("Continuar con e-mail"),
    TEXTO_CREAR_CUENTA ("Crear una cuenta"),
    TEXTO_INICIAR_SESION ("Iniciar sesión"),
    TEXTO_EMPEZAR_BUSCAR("Empezar a buscar");


    private String texto;

    EnumGenerico(String texto) {
        this.texto = texto;
    }

    public String getValue() {
        return this.texto;
    }
}
