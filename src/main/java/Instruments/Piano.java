package Instruments;

public class Piano extends AbstractInstrument {

    private Boolean electric;

    public Piano(Type type, String sound, String brand, String colour, double purch, double sell, Boolean electric) {
        super(type, sound, brand, colour, purch, sell);
        this.electric = electric;
    }

    public Boolean getElectric() {
        return electric;
    }
}