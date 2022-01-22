package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class AbstractInstrument implements ISell, IPlay {

    private Type type;
    private String sound;
    private String brand;
    private String colour;
    private double purch;
    private double sell;

    public AbstractInstrument(Type type, String sound, String brand, String colour, double purch, double sell) {
        this.type = type;
        this.sound = sound;
        this.brand = brand;
        this.colour = colour;
        this.purch = purch;
        this.sell = sell;
    }

    public Type getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public double getPurch() {
        return purch;
    }

    public double getSell() {
        return sell;
    }

    public double markup() {
        return sell - purch;
    }

    public String playSound() {
        return sound;
    }
}
