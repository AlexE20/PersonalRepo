package Builder;

public class Director {
   private BuilderCasa1 builderCasa1;

    public Director(BuilderCasa1 builderCasa1) {
        this.builderCasa1 = builderCasa1;
    }

    public Casa creadorDeCasas(String Terraza, String Patio, String terceraPlanta){
builderCasa1.buildTerraza(Terraza);
builderCasa1.buildPatio(Patio);
builderCasa1.buildTerceraPlanta(terceraPlanta);

return builderCasa1.buildCasa();
}
}
