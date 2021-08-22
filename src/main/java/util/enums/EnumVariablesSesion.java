package util.enums;

public enum EnumVariablesSesion {

    CLAVE("clave");


    private String nombreVariable;

    EnumVariablesSesion(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    public String getValue() {
        return this.nombreVariable;
    }
}
