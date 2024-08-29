package Models;

import java.util.Date;

public class Document {
    private String payMethod;
    private Date date;
    private Client client;
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
    }

    @Override
    public String toString() {
        return "Document{" +
                "payMeethod='" + payMethod + '\'' +
                ", date='" + date + '\'' +
                ", client=" + client +
                ", car=" + car + 
                ", seller=" + seller +
                '}';
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
