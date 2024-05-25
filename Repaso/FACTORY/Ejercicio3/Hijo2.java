package Ejercicio3;

public class Hijo2 extends Padre{
    private String att1H2;
    private String att2H2;

    public Hijo2() {
    }

    public Hijo2(String att1H2, String att2H2) {
        this.att1H2 = att1H2;
        this.att2H2 = att2H2;
    }

    public Hijo2(String att1, String att1H2, String att2H2) {
        super(att1);
        this.att1H2 = att1H2;
        this.att2H2 = att2H2;
    }

    public String getAtt1H2() {
        return att1H2;
    }

    public void setAtt1H2(String att1H2) {
        this.att1H2 = att1H2;
    }

    public String getAtt2H2() {
        return att2H2;
    }

    public void setAtt2H2(String att2H2) {
        this.att2H2 = att2H2;
    }

    @Override
    public String[] getatts() {
        String[]result={att1H2,att2H2};
        return result;
    }
}
