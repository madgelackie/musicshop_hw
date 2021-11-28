package OtherStock;

import Behaviours.ISell;

public class GuitarPedals implements ISell {
    private double purchasedForPrice;
    private double sellPrice;
    private String name;
    private String effect;

    public GuitarPedals(double purchasedForPrice, double sellPrice, String name, String effect) {
        this.purchasedForPrice = purchasedForPrice;
        this.sellPrice = sellPrice;
        this.name = name;
        this.effect = effect;
    }

    public double getPurchasedForPrice() {
        return purchasedForPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public double calculateMarkUp(){
        return this.sellPrice - this.purchasedForPrice;
    }
}
