package Models;

import java.util.List;
import java.util.ArrayList;

public class Concessionaire {
    private String name;
    private String NIT;
    private List<Service> listServices;
    private List<Seller> listSellers;
    private List<Car> listCars;

    public Concessionaire() {

    }

    public Concessionaire(String name, String NIT) {
        this.name = name;
        this.NIT = NIT;
        this.listServices = new ArrayList<>();
        this.listSellers = new ArrayList<>();
        this.listCars = new ArrayList<>();
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String nIT) {
        NIT = nIT;
    }

    public List<Service> getListServices() {
        return listServices;
    }

    public void setListServices(List<Service> listServices) {
        this.listServices = listServices;
    }

    public List<Seller> getListSellers() {
        return listSellers;
    }

    public void setListSellers(List<Seller> listSellers) {
        this.listSellers = listSellers;
    }

    public List<Car> getListCars() {
        return listCars;
    }

    public void setListCars(List<Car> listCars) {
        this.listCars = listCars;
    }
    

}