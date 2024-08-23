package Class;

import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private Concessionaire location;
    private List<Service> locationServices;
    private List<Car> listCars;

    public Inventory() {

    }

    public Inventory(Concessionaire location) {
        this.location = location;
        this.locationServices = new ArrayList<>();
        this.listCars = new ArrayList<>();
    }

    public Concessionaire getLocation() {
        return location;
    }

    public void setLocation(Concessionaire location) {
        this.location = location;
    }

    public List<Service> getLocationServices() {
        return locationServices;
    }

    public void setLocationServices(List<Service> locationServices) {
        this.locationServices = locationServices;
    }

    public List<Car> getListCars() {
        return listCars;
    }

    public void setListCars(List<Car> listCars) {
        this.listCars = listCars;
    }

}
