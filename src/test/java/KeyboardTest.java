import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    Keyboard keyboard;

    @Before
    public void before() {
        keyboard = new Keyboard("plastic", "red", InstrumentType.KEYBOARD, 120, 150, 36);
    }

    @Test
    public void getMaterial() {
        assertEquals("plastic", keyboard.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("red", keyboard.getColour());
    }

    @Test
    public void getType() {
        assertEquals("Keyboard", keyboard.getType());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(120, keyboard.getBuyPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(150, keyboard.getSellPrice());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(36, keyboard.getNumberKeys());
    }

    @Test
    public void canPlayKeyboard() {
        assertEquals("Plink plonk...", keyboard.play());
    }

    @Test
    public void getMarkUpValue() {
        assertEquals(30, keyboard.calculateMarkup());
    }
}
