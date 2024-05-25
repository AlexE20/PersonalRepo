package Builder;

public class BuilderCasa1 implements BuilderCasas{

    private Casa casa=new Casa();
    @Override
    public void buildTerraza(String Terraza) {
        casa.setTerraza(Terraza);
    }

    @Override
    public void buildPatio(String Patio) {
    casa.setPatio(Patio);
    }

    @Override
    public void buildTerceraPlanta(String TerceraPlanta) {
    casa.setTerceraPlanta(TerceraPlanta);
    }

    @Override
    public Casa buildCasa() {
        return casa;
    }
}
