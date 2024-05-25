package ChainOfResponsability;

public class CheckProfession implements Handler {
    private Handler next=null;

    @Override
    public void setNext(Handler next) {
        this.next=next;

    }

    public boolean handle(Persona p) {
       if(p.getProfesion().equals("Estudiante")){
           if (next==null){
               return true;
           }else return next.handle(p);
       }else return false;
    }
}
