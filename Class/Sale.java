package Class;

public class Sale {
    private String registration;
    private String originCar;
    private Document document;

    public Sale() {

    }

    public Sale(String registration, String originCar, Document document) {
        this.registration = registration;
        this.originCar = originCar;
        this.document = document;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "Registration='" + registration + '\'' +
                ", originCar='" + originCar + '\'' +
                ", document='" + document + '\'' +
                '}';
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getOriginCar() {
        return originCar;
    }

    public void setOriginCar(String originCar) {
        this.originCar = originCar;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

}
