package AbstractFactory.Mesa;

public class Mesa {
    private String material;

    public Mesa(String material) {
        this.material = material;
    }

 public Mesa(){};

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
