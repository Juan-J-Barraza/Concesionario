package Class;

public class Service {
    private String name;
    private String address;
    private String NIF;

    public Service() {

    }

    public Service(String name, String address, String NIF) {
        this.name = name;
        this.address = address;
        this.NIF = NIF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String nIF) {
        NIF = nIF;
    }

}
