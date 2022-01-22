package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(Type.PIANO, "tinkle", "Yamaha", "White", 700, 1000,true);
    }

    @Test
    public void canGetElectric() {
        assertEquals(true, piano.getElectric());
    }

    //    All the other super class methods were tested in Bass and did not need tested again.

}