package Accessories;

import Instruments.Type;
import Interfaces.ISell;

public class Accessory implements ISell {

    private Type type;
    private String desc;
    private double purch;
    private double sell;

    public Accessory(Type type, String desc, double purch, double sell) {
        this.type = type;
        this.desc = desc;
        this.purch = purch;
        this.sell = sell;
    }

    public Type getType() {
        return type;
    }

    public String getDesc() {
        return desc;
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
}
