import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int addItemsToStock(ISell item) {
        stock.add(item);
        return stock.size();
    }

    public int sellStockItem(ISell item) {
        stock.remove(item);
        return stock.size();
    }

}
