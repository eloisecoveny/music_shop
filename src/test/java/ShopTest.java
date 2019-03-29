import items.accessories.AccessoryType;
import items.accessories.Strings;
import items.instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.Visitor;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    public Shop shop;
    public Piano piano;
    public Strings strings;
    public Visitor visitor;

    @Before
    public void setup(){
        shop = new Shop("Musical Matters", 340.00);

        piano = new Piano(123.50, 210.00, "Steinway", "Model B");
        strings = new Strings(12.50, 15.90, "D'Addario", "Prelude", AccessoryType.CELLO);

        shop.buyStock(piano);
        shop.buyStock(strings);

        visitor = new Visitor("Eloise", 23.40);
    }

    @Test
    public void hasName(){
        assertEquals("Musical Matters", shop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(340.00, shop.getTill(), 0.01);
    }

    @Test
    public void hasStock(){
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        assertEquals(89.90, shop.calculateProfit(), 0.01);
    }

    @Test
    public void canSellItemToVisitor(){
        shop.sell(visitor, strings);
        assertEquals(1, shop.countStock());
        assertEquals(7.50, visitor.getPurse(), 0.01);
        assertEquals(1, visitor.countInventory());
        assertEquals(355.90, shop.getTill(), 0.01);
    }
}
