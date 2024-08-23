package Class;

import java.util.List;
import java.util.ArrayList;

public class Seller {
    private String name;
    private String lastName;
    private String NIF;
    private String address;
    private List<Client> listClients;
    private List<Sale> listSales;

    public Seller() {

    }

    public Seller(String name, String lastName, String NIF, String address) {
        this.name = name;
        this.lastName = lastName;
        this.NIF = NIF;
        this.address = address;
        this.listClients = new ArrayList<>();
        this.listSales = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String nIF) {
        NIF = nIF;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Client> getListClients() {
        return listClients;
    }

    public void setListClients(List<Client> listClients) {
        this.listClients = listClients;
    }

    public List<Sale> getListSales() {
        return listSales;
    }

    public void setListSales(List<Sale> listSales) {
        this.listSales = listSales;
    }

}
