package ChainOfResponsability;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Mary Poppins", "Estudiante", 3, 1, LocalDate.of(2005, 5, 14), LocalDate.of(2020, 3, 7));
        Handler chain = makeChain(new CheckRegHandler(), new CheckProfession(), new CheckRegHandler());
        if (chain.handle(p)) {
            System.out.println("Puede participar");

        }else {
            System.out.println("No puede participar");
        }






        }
    private static Handler makeChain (Handler first, Handler ...theRest){
   Handler aux=first;
        for (Handler next: theRest) {
            aux.setNext(next);
            aux=next;
        }
            return first;
        }
    }



