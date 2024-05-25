import Decorator.*;
import Iterator.*;
import Residente.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       SMS sms= new SMS();
       Email email= new Email();
       Whatsapp whatsapp= new Whatsapp();

       CollecionResidentes residentes = new CollecionResidentes(loadResidents());
        IteradorResidente iterador;

        iterador = residentes.crearResidenteEnMora();
        System.out.println("Deben: ");
        while (iterador.hasMore()){
            Residente residente = iterador.getNext();
            System.out.println(sms.mandarNotificacion());
            System.out.println(email.mandarNotificacion());
            System.out.println(whatsapp.mandarNotificacion());
            System.out.println( "\t" + residente.getNombre() +  " " + residente.getApellido() + " " + residente.getNumeroApartamento() + " y deben: $"+ residente.getSaldoDeudor());
        }

        iterador = residentes.crearResidentePuntual();
        System.out.println("No deben: ");
        while (iterador.hasMore()){
            Residente residente = iterador.getNext();
            System.out.println( "\t" + residente.getNombre() +  " " + residente.getApellido() + " " + residente.getNumeroApartamento() );
        }
    }
    public static ArrayList<Residente> loadResidents() {
        ArrayList<Residente> residents = new ArrayList<>(10);


        residents.add(new Residente("Juan", "Gonzalez", 101, 0, "555-1234", "juan@example.com"));
        residents.add(new Residente("Maria", "Lopez", 102, 0, "555-5678", "maria@example.com"));
        residents.add(new Residente("Carlos", "Martinez", 103, 0, "555-9012", "carlos@example.com"));
        residents.add(new Residente("Ana", "Rodriguez", 104, 0, "555-3456", "ana@example.com"));
        residents.add(new Residente("Pedro", "Sanchez", 105, 0, "555-7890", "pedro@example.com"));


        residents.add(new Residente("Luis", "Perez", 201, 50.0, "555-1111", "luis@example.com"));
        residents.add(new Residente("Laura", "Gomez", 202, 75.0, "555-2222", "laura@example.com"));
        residents.add(new Residente("Javier", "Diaz", 203, 100.0, "555-3333", "javier@example.com"));
        residents.add(new Residente("Sofia", "Hernandez", 204, 125.0, "555-4444", "sofia@example.com"));
        residents.add(new Residente("Miguel", "Torres", 205, 150.0, "555-5555", "miguel@example.com"));

        return residents;
}


}
