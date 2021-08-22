package util.enums;

public enum EnumMenu {
    INICIARSESION ("IniciarSesion"),
    CREARCUENTA ("CrearCuenta"),
    TURISMO ("Turismo");

    private String menu;

    EnumMenu(String menu) {
        this.menu = menu;
    }

    public String getValue() {
        return this.menu;
    }

}
