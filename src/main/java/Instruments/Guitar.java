package Instruments;

public class Guitar extends AbstractInstrument {

    private int numberOfPickups;

    public Guitar(Type type, String sound, String brand, String colour, double purch, double sell, int numberOfPickups) {
        super(type, sound, brand, colour, purch, sell);
        this.numberOfPickups = numberOfPickups;
    }

    public int getNumberOfPickups() {
        return numberOfPickups;
    }
}
