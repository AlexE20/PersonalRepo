package Decorator;

public class Whatsapp extends DecoradorNotiBase {
public Whatsapp() {

}
@Override
public String mandarNotificacion(){
    return"Whatsapp: Tiene una deuda que pagar, aplicara mora";
}
}
