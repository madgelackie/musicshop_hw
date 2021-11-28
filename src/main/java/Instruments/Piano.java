package Instruments;

import Behaviours.IPlay;

public class Piano extends Instrument implements IPlay {
    private PianoType pianoType;
    private String manufacturer;

    public Piano(InstrumentCategory category, double purchasedForPrice, double sellPrice, PianoType pianoType, String manufacturer) {
        super(category, purchasedForPrice, sellPrice);
        this.pianoType = pianoType;
        this.manufacturer = manufacturer;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String play(){
        return "tinkle tinkle";
    }
}
