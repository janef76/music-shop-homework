import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Hickory", 5, 10, 12);
    }

    @Test
    public void getGuitarStringType() {
        assertEquals("Hickory", drumSticks.getType());
    }

    @Test
    public void getGuitarBuyPrice() {
        assertEquals(5, drumSticks.getBuyPrice());
    }

    @Test
    public void getGuitarSellPrice() {
        assertEquals(10, drumSticks.getSellPrice());
    }

    @Test
    public void getGuitarStringsNumber() {
        assertEquals(12, drumSticks.getLengthOfSticks());
    }

    @Test
    public void getMarkupValue() {
        assertEquals(5, drumSticks.calculateMarkup());
    }
}
