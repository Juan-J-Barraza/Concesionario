package Models;


public class Inventory {
    private Concessionaire concessionaire;

    public Inventory() {

    }

    public Inventory(Concessionaire concessionaire) {
        this.concessionaire = concessionaire;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                ", concessionaire=" + concessionaire +
                '}';
    }

    public Concessionaire getconcessionaire() {
        return concessionaire;
    }

    public void setconcessionaire(Concessionaire concessionaire) {
        this.concessionaire = concessionaire;
    }


}
