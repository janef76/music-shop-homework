public class Sax extends Instruments {
    String reedType;

    public Sax(String material, String colour, String type, int buyPrice, int sellPrice, String reedType) {
        super(material, colour, type, buyPrice, sellPrice);
        this.reedType = reedType;
    }

    public String getReedType() {
        return this.reedType;
    }

    public String play() {
        return "buhoomu-hoooooooom";
    }
}
