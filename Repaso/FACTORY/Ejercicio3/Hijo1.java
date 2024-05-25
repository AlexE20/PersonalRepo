package Ejercicio3;

public class Hijo1 extends Padre{
    private String att1H1;
    private String att2H1;

    public Hijo1() {
    }

    public Hijo1(String att1H1, String att2H1) {
        this.att1H1 = att1H1;
        this.att2H1 = att2H1;
    }

    public Hijo1(String att1, String att1H1, String att2H1) {
        super(att1);
        this.att1H1 = att1H1;
        this.att2H1 = att2H1;
    }

    public String getAtt1H1() {
        return att1H1;
    }

    public void setAtt1H1(String att1H1) {
        this.att1H1 = att1H1;
    }

    public String getAtt2H1() {
        return att2H1;
    }

    public void setAtt2H1(String att2H1) {
        this.att2H1 = att2H1;
    }

    @Override
    public String[] getatts() {
        String[] result={att1H1,att2H1};
        return result;
    }
}
