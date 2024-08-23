package Class;

public class ExtraEquipment {
    private String name;
    private String price;

    public ExtraEquipment() {

    }

    public ExtraEquipment(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
