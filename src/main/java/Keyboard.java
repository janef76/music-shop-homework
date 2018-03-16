public class Keyboard extends Instruments{

    int numberKeys;

    public Keyboard(String material, String colour, String type, int buyPrice, int sellPrice, int numberKeys) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numberKeys = numberKeys;
    }

    public int getNumberKeys() {
        return this.numberKeys;
    }

    public String play() {
        return "Plink plonk...";
    }

}
