import items.accessories.Accessory;
import items.accessories.AccessoryType;
import items.accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    public Strings strings;

    @Before
    public void setup(){
        strings = new Strings(12.50, 15.90, "D'Addario", "Prelude", AccessoryType.CELLO);
    }

    @Test
    public void hasCostPrice(){
        assertEquals(12.50, strings.getCostPrice(), 0.01);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(15.90, strings.getRetailPrice(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("D'Addario", strings.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Prelude", strings.getModel());
    }

    @Test
    public void hasAccessoryType(){
        assertEquals(AccessoryType.CELLO, strings.getAccessoryType());
    }

    @Test
    public void canChangeCostPrice(){
        strings.setCostPrice(12.90);
        assertEquals(12.90, strings.getCostPrice(), 0.01);
    }

    @Test
    public void canChangeRetailPrice(){
        strings.setRetailPrice(16.50);
        assertEquals(16.50, strings.getRetailPrice(), 0.01);
    }

    @Test
    public void canChangeMake(){
        strings.setMake("Larsen Strings");
        assertEquals("Larsen Strings", strings.getMake());
    }

    @Test
    public void canChangeModel(){
        strings.setModel("Prelude Model B");
        assertEquals("Prelude Model B", strings.getModel());
    }

    @Test
    public void canChangeAccessoryType(){
        strings.setAccessoryType(AccessoryType.VIOLIN);
        assertEquals(AccessoryType.VIOLIN, strings.getAccessoryType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.40, strings.calculateMarkup(), 0.01);
    }
}
