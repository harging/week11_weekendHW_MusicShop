package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(Type.GUITAR, "bram", "Fender", "Red", 300, 400, 3);
    }

    @Test
    public void canGetNumberOfPickups() {
        assertEquals(3, guitar.getNumberOfPickups());
    }

//    All the other super class methods were tested in Bass and did not need tested again.
}