package Ejercicio3;

public class FactoryHijo2 implements CrearHijos {
    @Override
    public void crearHijos(String[] atts) {
        new Hijo2(atts[1],atts[2]);
    }
}
