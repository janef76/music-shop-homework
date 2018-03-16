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
        guitar = new Guitar("wood", "Blue", InstrumentType.STRING, 100, 120, 6);
        trumpet = new Trumpet("Gold", "gold", InstrumentType.BRASS, 150, 250, 3);
    }

    @Test
    public void getName() {
        assertEquals("Jungle Drums!", shop.getName());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItemsToStock(guitar);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canSellStockItem() {
        shop.addItemsToStock(guitar);
        shop.addItemsToStock(trumpet);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canBuyAndSell() {
        shop.addItemsToStock(guitar);
        shop.addItemsToStock(trumpet);
        shop.sellStockItem(trumpet);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canGetMarkUpValueOfAllStock() {
        shop.addItemsToStock(guitar);
        shop.addItemsToStock(trumpet);
        assertEquals(120, shop.calculateAllMarkup());
    }
}
