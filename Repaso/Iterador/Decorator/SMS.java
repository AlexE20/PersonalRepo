package Decorator;

public class SMS implements Notificacion {

    @Override
    public String mandarNotificacion() {

        return "SMS: Tienes una deuda,aplicara mora";
    }
}
