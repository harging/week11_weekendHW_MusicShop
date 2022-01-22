package Accessories;

import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
     public void setUp() {
        accessory = new Accessory(Type.GUITAR, "Soft case", 15, 25);
    }

    @Test
    public void canGetType() {
        assertEquals(Type.GUITAR, accessory.getType());
    }

    @Test
    public void canGetDesc() {
        assertEquals("Soft case", accessory.getDesc());
    }

    @Test
    public void canGetPurch() {
        assertEquals(15, accessory.getPurch(), 0.0);
    }

    @Test
    public void canGetSell() {
        assertEquals(25, accessory.getSell(), 0.0);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(10, accessory.markup(), 0.0);
    }
}