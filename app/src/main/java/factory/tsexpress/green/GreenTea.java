package factory.tsexpress.green;

public class GreenTea {
    private String name;
    private String tea;
    private String ice;
    private String sugar;
    private String topping;

    public GreenTea(String tea, String ice, String sugar) {
        this.tea = tea;
        this.ice = ice;
        this.sugar = sugar;
    }

    public String getTea() {
        return tea;
    }
    public String getIce() {
        return ice;
    }
    public String getSugar() {
        return sugar;
    }
    public String getTopping() {
        return topping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
