import java.util.ArrayList;

public class Shop {

    Instruments instruments;
    Accessories accessories;

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addItemsToStock(ISell item) {
        stock.add(item);
    }

    public void sellStockItem(ISell item) {
        stock.remove(item);
    }

    public int getStockSize() {
        return stock.size();
    }

    public int calculateAllMarkup() {
        int total = 0;
        for (int i = 0; i < stock.size(); i++) {
            total += instruments.calculateMarkup(); // + accessories.calculateMarkup();
        }
        return total;
    }

}
