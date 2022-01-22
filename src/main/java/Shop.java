import Instruments.Type;
import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

    public double totalProfit() {
        double total = 0;
        for(ISell item: stock) {
           total += item.markup();
        }
        return total;
    }

    public int totalType(Type type) {
        ArrayList<Type> types = new ArrayList<>();
        for(ISell item: stock) {
            if(item.getType() == type){
                types.add(item.getType());
            }
        }
        return types.size();
    }
}
