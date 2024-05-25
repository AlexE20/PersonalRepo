package Ejercicio3;

public class FactoryHijo1 implements CrearHijos{
    @Override
    public void crearHijos(String[] atts) {
        new Hijo1(atts[1],atts[2]);

    }
}
