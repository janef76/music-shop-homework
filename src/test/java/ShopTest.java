import org.junit.Before;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Trumpet trumpet;

    @Before
    public void before() {
        shop = new Shop("Jungle Drums!");
        guitar = new Guitar("wood", "Blue", "strings", 100, 120, 6);
        trumpet = new Trumpet("Gold", "gold", "brass", 150, 250, 3);
    }

    @Test
    public void getName() {
        assertEquals("Jungle Drums!", shop.getName());
    }

    @Test
    public void canAddItemsToStock() {
        assertEquals(1, shop.addItemsToStock(guitar));
    }

    @Test
    public void canSellStockItem() {
        shop.addItemsToStock(guitar);
        assertEquals(0, shop.sellStockItem(guitar));
    }

    @Test
    public void canBuyAndSell() {
        shop.addItemsToStock(guitar);
        shop.addItemsToStock(trumpet);
        assertEquals(1, shop.sellStockItem(trumpet));
    }
}
