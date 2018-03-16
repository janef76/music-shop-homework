import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Nylon", 100, 150, 4);
    }

    @Test
    public void getGuitarStringType() {
        assertEquals("Nylon", guitarStrings.getType());
    }

    @Test
    public void getGuitarBuyPrice() {
        assertEquals(100, guitarStrings.getBuyPrice());
    }

    @Test
    public void getGuitarSellPrice() {
        assertEquals(150, guitarStrings.getSellPrice());
    }

    @Test
    public void getGuitarStringsNumber() {
        assertEquals(4, guitarStrings.getNumberOfStrings());
    }

    @Test
    public void getMarkupValue() {
        assertEquals(50, guitarStrings.calculateMarkup());
    }
}
