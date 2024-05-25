package AbstractFactory;

import AbstractFactory.Mesa.Mesa;
import AbstractFactory.Mesa.MesaPlastico;
import AbstractFactory.Silla.Silla;
import AbstractFactory.Silla.SillaPlastico;

public class FactoryPlasticos implements AbstractFactory {

    @Override
    public Silla crearSilla() {
        return new SillaPlastico();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaPlastico();
    }

    public void detallesMesaMadera(){
        System.out.println("Se ha creado una mesa de madera");


    }

    public void detallesMesaPlastico(){
        System.out.println("Se ha creado una mesa de plastico");


    }
}
