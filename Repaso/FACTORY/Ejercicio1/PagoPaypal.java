package Ejercicio1;

import Ejercicio1.Pago;

public class PagoPaypal implements Pago {
    @Override
    public void crearPago() {
        System.out.println("Se ha procesado su pago en Paypal");
    }
}
