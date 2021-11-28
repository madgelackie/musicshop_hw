package Instruments;

import Behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {
    private SaxophoneType saxophoneType;
    private String manufacturer;

    public Saxophone(InstrumentCategory category, double purchasedForPrice, double sellPrice, SaxophoneType saxophoneType, String manufacturer) {
        super(category, purchasedForPrice, sellPrice);
        this.saxophoneType = saxophoneType;
        this.manufacturer = manufacturer;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String play(){
        return "Toot a-toot a-toot";
    }
}


