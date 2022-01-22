import Accessories.Accessory;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Type;
import Interfaces.ISell;
import org.junit.Before;
import Instruments.Bass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock = new ArrayList<>();
    Accessory accessory;
    Accessory accessory2;
    Bass bass;
    Guitar guitar;
    Piano piano;

    @Before
    public void before() {
        accessory = new Accessory(Type.GUITAR, "Soft case", 20, 35);
        accessory2 = new Accessory(Type.GUITAR, "Hard case", 90, 120);
        bass = new Bass(Type.BASS, "doot", "Fender", "Black", 200, 300, false);
        guitar = new Guitar(Type.GUITAR, "bram", "Fender", "Red", 300, 500, 3);
        piano = new Piano(Type.PIANO, "tinkle", "Yamaha", "White", 700, 1000, true);
        stock.add(guitar);
        shop = new Shop(stock);
    }

    @Test
    public void canGetStock() {
        assertEquals(stock, shop.getStock());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(accessory);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canGetTotalProfit() {
        shop.addToStock(accessory);
        shop.addToStock(bass);
        shop.addToStock(piano);
        assertEquals(615, shop.totalProfit(), 0.0);
    }

    @Test
    public void canGetTotalType() {
        shop.addToStock(accessory);
        shop.addToStock(accessory2);
        shop.addToStock(bass);
        shop.addToStock(piano);
        assertEquals(3, shop.totalType(Type.GUITAR));
    }
}