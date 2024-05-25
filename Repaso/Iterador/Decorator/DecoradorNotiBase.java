package Decorator;

public class DecoradorNotiBase implements Notificacion{

    private Notificacion wrappee;

    public DecoradorNotiBase() {};

    DecoradorNotiBase(Notificacion notificacion){
    this.wrappee=notificacion;

    }
    @Override
    public String mandarNotificacion() {
    return wrappee.mandarNotificacion();
    }
}
