package AbstractFactory;
import AbstractFactory.Silla.*;
import AbstractFactory.Mesa.*;



public interface AbstractFactory {
    Silla crearSilla();
    Mesa crearMesa();

}
