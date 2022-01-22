package Instruments;

public class Bass extends AbstractInstrument {

    private Boolean active;

    public Bass(Type type, String sound, String brand, String colour, double purch, double sell, Boolean active) {
        super(type, sound, brand, colour, purch, sell);
        this.active = active;
    }

    public Boolean getActive() {
        return active;
    }
}