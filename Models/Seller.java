package Models;

import java.util.List;
import java.util.ArrayList;

public class Seller {
    private String name;
    private String lastName;
    private String NIF;
    private String address;
    private Concessionaire concessionaire;
    private List<Client> listClients;
    private List<Sale> listSales;
    private List<Document> listDocument;

    public Seller() {

    }

    public Seller(String name, String lastName, String NIF, String address, Concessionaire concessionaire) {
        this.name = name;
        this.lastName = lastName;
        this.NIF = NIF;
        this.address = address;
        this.concessionaire = concessionaire;
        this.listClients = new ArrayList<>();
        this.listSales = new ArrayList<>();
        this.listDocument = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Seller{" +
               "name='" + name + '\'' +
               ", lastName='" + lastName + '\'' +
               ", NIF='" + NIF + '\'' +
               '}';
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

    public Concessionaire getConcessionaire() {
        return concessionaire;
    }

    public void setConcessionaire(Concessionaire concessionaire) {
        this.concessionaire = concessionaire;
    }

    public List<Document> getListDocument() {
        return listDocument;
    }

    public void setListDocument(List<Document> listDocument) {
        this.listDocument = listDocument;
    }
    

}
