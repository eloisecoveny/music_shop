import items.instruments.InstrumentType;
import items.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    public Piano piano;

    @Before
    public void setup(){
        piano = new Piano(123.50, 210.00, "Steinway", "Model B");
    }

    @Test
    public void hasCostPrice(){
        assertEquals(123.50, piano.getCostPrice(), 0.01);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(210.00, piano.getRetailPrice(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("Steinway", piano.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Model B", piano.getModel());
    }

    @Test
    public void hasKeyboardInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void canPlay(){
        assertEquals("Chopin's Nocturne...", piano.play());
    }

    @Test
    public void canChangeCostPrice(){
        piano.setCostPrice(140.90);
        assertEquals(140.90, piano.getCostPrice(), 0.01);
    }

    @Test
    public void canChangeRetailPrice(){
        piano.setRetailPrice(225.00);
        assertEquals(225.00, piano.getRetailPrice(), 0.01);
    }

    @Test
    public void canChangeMake(){
        piano.setMake("Steinway Pianos");
        assertEquals("Steinway Pianos", piano.getMake());
    }

    @Test
    public void canChangeModel(){
        piano.setModel("Model C");
        assertEquals("Model C", piano.getModel());
    }

    @Test
    public void canChangeInstrumentType(){
        piano.setInstrumentType(InstrumentType.WOODWIND);
        assertEquals(InstrumentType.WOODWIND, piano.getInstrumentType());
    }
}
