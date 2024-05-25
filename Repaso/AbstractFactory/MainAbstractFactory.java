package AbstractFactory;

import AbstractFactory.FactoryMadera;
import AbstractFactory.FactoryPlasticos;

public class MainAbstractFactory {
    public static void main(String[] args){
        FactoryMadera factoryMadera=new FactoryMadera();
        FactoryPlasticos factoryPlasticos= new FactoryPlasticos();
        factoryPlasticos.crearMesa();
        factoryPlasticos.detallesMesaPlastico();






    }
}
