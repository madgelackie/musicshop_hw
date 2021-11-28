package OtherStock;

public class GuitarPedal extends OtherStockItems {
    private String name;
    private String effect;

    public GuitarPedal(double purchasedForPrice, double sellPrice, String name, String effect) {
        super(purchasedForPrice, sellPrice);
        this.name = name;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

}
