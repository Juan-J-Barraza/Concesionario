package Class;

import java.util.List;
import java.util.ArrayList;

public class Car {
    private String frameNumber;
    private Float price;
    private Float discount;
    private String technicalData;
    private String power;
    private String brand;
    private String models;
    private String status;
    private String feactures;
    private List<Equipment> listEquipmets;
    private List<ExtraEquipment> listAvailableExtras;

    public Car() {

    }

    public Car(String frameNumber, Float price, String technicalData, String power, String brand, String models,
            String status, String feactures) {
        this.frameNumber = frameNumber;
        this.price = price;
        this.technicalData = technicalData;
        this.power = power;
        this.brand = brand;
        this.models = models;
        this.status = status;
        this.feactures = feactures;
        this.listEquipmets = new ArrayList<>();
    }

    public Car(String frameNumber, Float price, Float discount, String technicalData, String power, String brand,
            String models, String status, String feactures) {
        this.frameNumber = frameNumber;
        this.price = price;
        this.discount = discount;
        this.technicalData = technicalData;
        this.power = power;
        this.brand = brand;
        this.models = models;
        this.status = status;
        this.feactures = feactures;
        this.listEquipmets = new ArrayList<>();
        this.listAvailableExtras = new ArrayList<>();
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getTechnicalData() {
        return technicalData;
    }

    public void setTechnicalData(String technicalData) {
        this.technicalData = technicalData;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeactures() {
        return feactures;
    }

    public void setFeactures(String feactures) {
        this.feactures = feactures;
    }

    public List<Equipment> getListEquipmets() {
        return listEquipmets;
    }

    public void setListEquipmets(List<Equipment> listEquipmets) {
        this.listEquipmets = listEquipmets;
    }

    public List<ExtraEquipment> getListAvailableExtras() {
        return listAvailableExtras;
    }

    public void setListAvailableExtras(List<ExtraEquipment> listAvailableExtras) {
        this.listAvailableExtras = listAvailableExtras;
    }


    
}
