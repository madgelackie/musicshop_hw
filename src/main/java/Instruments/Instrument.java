package Instruments;

import Behaviours.ISell;

public abstract class Instrument implements ISell {
    private InstrumentCategory category;
    private double purchasedForPrice;
    private double sellPrice;

    public Instrument(InstrumentCategory category, double purchasedForPrice, double sellPrice) {
        this.category = category;
        this.purchasedForPrice = purchasedForPrice;
        this.sellPrice = sellPrice;
    }

    public InstrumentCategory getCategory() {
        return category;
    }

    public double getPurchasedForPrice() {
        return purchasedForPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkUp(){
        return this.sellPrice - this.purchasedForPrice;
    }
}
