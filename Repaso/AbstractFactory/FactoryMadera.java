package AbstractFactory;

import AbstractFactory.Mesa.Mesa;
import AbstractFactory.Mesa.MesaMadera;
import AbstractFactory.Mesa.MesaPlastico;
import AbstractFactory.Silla.Silla;
import AbstractFactory.Silla.SillaMadera;

public class FactoryMadera implements AbstractFactory {


    @Override
    public Silla crearSilla() {
        return new SillaMadera();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaMadera();
    }
}
