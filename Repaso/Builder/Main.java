package Builder;

public class Main {
    public static void main(String[] args){
        BuilderCasa1 builderCasa1=new BuilderCasa1();
Director director= new Director(builderCasa1);
Casa casa1=director.creadorDeCasas("SI","NO","COMEMIERDA");
        System.out.println(casa1);





    }
}
