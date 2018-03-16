import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wood", "Black", InstrumentType.STRING, 50, 100, 6);
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void getType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(50, guitar.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(100, guitar.getSellPrice());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(6, guitar.getNumberStrings());
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("Strum strum...", guitar.play());
    }

    @Test
    public void getMarkUpValue() {
        assertEquals(50, guitar.calculateMarkup());
    }

}
