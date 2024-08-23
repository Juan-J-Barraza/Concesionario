package Class;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class Document {
    private String payMethod;
    private Date date;
    private Client client;
    private List<ExtraEquipment> listExtraEquipments;
    private Car car;
    private Seller seller;

    public Document() {

    }

    public Document(String payMethod, Date date, Client client, Car car, Seller seller) {
        this.payMethod = payMethod;
        this.date = date;
        this.client = client;
        this.car = car;
        this.seller = seller;
        this.listExtraEquipments = new ArrayList<>();
    }


    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ExtraEquipment> getListExtraEquipments() {
        return listExtraEquipments;
    }

    public void setListExtraEquipments(List<ExtraEquipment> listExtraEquipments) {
        this.listExtraEquipments = listExtraEquipments;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

}
