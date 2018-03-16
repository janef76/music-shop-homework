public class Guitar extends Instruments{

    int numberStrings;

    public Guitar(String material, String colour, String type, int buyPrice, int sellPrice, int numberStrings) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return this.numberStrings;
    }

    public String play() {
        return "Strum strum...";
    }

}
