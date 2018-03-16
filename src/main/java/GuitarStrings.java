public class GuitarStrings extends Accessories{
    int numberOfStrings;

    public GuitarStrings(String type, int buyPrice, int sellPrice, int numberOfStrings) {
        super(type, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

}
