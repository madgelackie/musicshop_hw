package OtherStock;

import Behaviours.ISell;

public abstract class OtherStockItems implements ISell {
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

    public double calculateMarkUp(){
        return this.purchasedForPrice - this.sellPrice;
    }

}
