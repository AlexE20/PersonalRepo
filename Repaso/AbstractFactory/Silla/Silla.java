package AbstractFactory.Silla;

public class Silla {
    private String material;

    public Silla(String material) {
        this.material = material;
    }
    public Silla(){};

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
