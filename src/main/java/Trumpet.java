public class Trumpet extends Instruments{

    int numberValves;

    public Trumpet(String material, String colour, InstrumentType type, int buyPrice, int sellPrice, int numberValves) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numberValves = numberValves;
    }

    public int getNumberOfValves() {
        return this.numberValves;
    }

    public String play() {
        return "Toot toot...";
    }
}
