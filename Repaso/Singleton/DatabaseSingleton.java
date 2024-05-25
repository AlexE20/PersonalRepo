package Singleton;
/*
En este ejemplo, la clase de conexión de la base de datos actúa como Singleton. Esta clase no
tiene un constructor público, por lo que la única manera de obtener su objeto es invocando el método obtenerInstancia.
Este método almacena en caché el primer objeto creado y lo devuelve en todas las llamadas siguientes.
*/



public class DatabaseSingleton {
    private static DatabaseSingleton instance;

    private DatabaseSingleton() {
    }

    public static DatabaseSingleton getInstance(){
        if(instance == null){
            System.out.println("Creando instancia de singleton");
            instance= new DatabaseSingleton();
        }
        return instance;

    }

    public void printmsg(String msg){
        System.out.println(msg);
    }
}
