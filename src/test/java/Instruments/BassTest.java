package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void before() {
        bass = new Bass(Type.BASS, "doot", "Fender", "Black", 200, 300, false);
    }

    @Test
    public void canGetType() {
        assertEquals(Type.BASS, bass.getType());
    }

    @Test
    public void canPlaySound() {
        assertEquals("doot", bass.playSound());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Fender", bass.getBrand());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", bass.getColour());
    }

    @Test
    public void canGetPurch() {
        assertEquals(200, bass.getPurch(), 0.0);
    }

    @Test
    public void canGetSell() {
        assertEquals(300, bass.getSell(), 0.0);
    }

    @Test
    public void canGetActive() {
        assertEquals(false, bass.getActive());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(100, bass.markup(), 0.0);
    }
}