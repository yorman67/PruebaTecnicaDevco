package util.enums;

public enum EnumVariablesSistema {

    USUARIOlOGIN("USUARIOPRUEBA"),
    CLAVELOGIN("CLAVEPRUEBA");


    private String nombreVariable;

    EnumVariablesSistema(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    public String getValue() {
        return this.nombreVariable;
    }
}
