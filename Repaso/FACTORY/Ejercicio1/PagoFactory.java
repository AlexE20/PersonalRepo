package Ejercicio1;

import Ejercicio1.Pago;
import Ejercicio1.PagoEfectivo;
import Ejercicio1.TipoDePago;

public class PagoFactory {

    public Pago obtenerPago(TipoDePago tipoDePago){
   return switch (tipoDePago){
        case PAYPAL -> new PagoPaypal();
        case TARJETA_CREDITO -> new PagoTarjetaCredito();
        case TARJETA_DEBITO -> new PagoTarjetaDebito();
        case EFECTIVO -> new PagoEfectivo();


    };

    }
}
