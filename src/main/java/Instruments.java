import java.util.ArrayList;

public abstract class Instruments implements IPlay, ISell {

    private String material;
    private String colour;
    private String type;
    private int buyPrice;
    private int sellPrice;

    public Instruments(String material, String colour, String type, int buyPrice, int sellPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public String getType() {
        return this.type;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }

}
