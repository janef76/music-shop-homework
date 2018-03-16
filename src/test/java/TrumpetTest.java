import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("silver", "silver", InstrumentType.BRASS, 70, 120, 3);
    }

    @Test
    public void getMaterial() {
        assertEquals("silver", trumpet.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("silver", trumpet.getColour());
    }

    @Test
    public void getType() {
        assertEquals("Brass", trumpet.getType());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(70, trumpet.getBuyPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(120, trumpet.getSellPrice());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlayTrumpet() {
        assertEquals("Toot toot...", trumpet.play());
    }

    @Test
    public void getMarkUpValue() {
        assertEquals(50, trumpet.calculateMarkup());
    }
}
