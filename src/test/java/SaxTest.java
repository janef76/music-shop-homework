import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxTest {
    Sax sax;

    @Before
    public void before() {
        sax = new Sax("brass", "gold", InstrumentType.WOODWIND, 200, 300, "single");
    }

    @Test
    public void getMaterial() {
        assertEquals("brass", sax.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("gold", sax.getColour());
    }

    @Test
    public void getType() {
        assertEquals("Woodwind", sax.getType());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(200, sax.getBuyPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(300, sax.getSellPrice());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals("single", sax.getReedType());
    }

    @Test
    public void canPlaySax() {
        assertEquals("buhoomu-hoooooooom", sax.play());
    }

    @Test
    public void getMarkUpValue() {
        assertEquals(100, sax.calculateMarkup());
    }
}
