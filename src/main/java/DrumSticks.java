public class DrumSticks extends Accessories {

    int length;

    public DrumSticks(String type, int buyPrice, int sellPrice, int length) {
        super(type, buyPrice, sellPrice);
        this.length = length;
    }

    public int getLengthOfSticks() {
        return this.length;
    }
}
