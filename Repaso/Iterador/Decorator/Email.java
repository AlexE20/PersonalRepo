package Decorator;

public class Email extends DecoradorNotiBase {
    public Email() {
    }

    @Override
    public String mandarNotificacion() {
        return "Email: Tiene una deuda que pagar, aplicara mora";

    }
}
