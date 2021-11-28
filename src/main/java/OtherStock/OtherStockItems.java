package OtherStock;

public abstract class OtherStockItems {
    private double purchasedForPrice;
    private double sellPrice;

    public OtherStockItems(double purchasedForPrice, double sellPrice) {
        this.purchasedForPrice = purchasedForPrice;
        this.sellPrice = sellPrice;
    }

    public double getPurchasedForPrice() {
        return purchasedForPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setPurchasedForPrice(double purchasedForPrice) {
        this.purchasedForPrice = purchasedForPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }


}
