package Class;

public class TypeConcessionaire {
    private String brand;
    private Concessionaire concesionarie;
    private Car car;

    public TypeConcessionaire() {

    }

    public TypeConcessionaire(String brand) {
        this.brand = brand;
    }

    public TypeConcessionaire(String brand, Concessionaire concesionarie, Car car) {
        this.brand = brand;
        this.concesionarie = concesionarie;
        this.car = car;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Concessionaire getConcesionarie() {
        return concesionarie;
    }

    public void setConcesionarie(Concessionaire concesionarie) {
        this.concesionarie = concesionarie;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    
}
