public abstract class Accessories implements ISell {
    private String type;
    private int buyPrice;
    private int sellPrice;


    public Accessories(String type, int buyPrice, int sellPrice) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
