package Models;

public class Client {
    private String name;
    private String lastName;
    private String typeDocument;
    private String numberDocument;
    private Seller seller;

    public Client() {

    }

    public Client(String name, String lastName, String typeDocument, String numberDocument, Seller seller) {
        this.name = name;
        this.lastName = lastName;
        this.typeDocument = typeDocument;
        this.numberDocument = numberDocument;
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", LastName='" + lastName + '\'' +
                ", numberDocument='" + numberDocument + '\'' +
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

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    

}
