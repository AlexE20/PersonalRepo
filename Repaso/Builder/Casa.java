package Builder;

public class Casa {
    private String terraza;

    private String patio;
    private String terceraPlanta;

    public Casa(String terraza, String patio, String terceraPlanta) {
        this.terraza = terraza;
        this.patio = patio;
        this.terceraPlanta = terceraPlanta;
    }

    public Casa() {
    }

    public String getTerraza() {
        return terraza;
    }

    public void setTerraza(String terraza) {
        this.terraza = terraza;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getTerceraPlanta() {
        return terceraPlanta;
    }

    public void setTerceraPlanta(String terceraPlanta) {
        this.terceraPlanta = terceraPlanta;
    }
    public String toString(){
        return "Terraza"+terraza+"Patio"+patio+"Tercera planta"+terceraPlanta;
    }
}
