package Ejercicio3;

public abstract class Padre {
    private String att1;

    public Padre() {
    }

    public Padre(String att1) {
        this.att1 = att1;
    }

    public String getAtt1() {
        return att1;
    }

    public void setAtt1(String att1) {
        this.att1 = att1;
    }

    public abstract String[] getatts();
}
