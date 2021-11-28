package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {
    private GuitarType guitarType;
    private String finish;
    private GuitarString guitarString;

    public Guitar(InstrumentCategory category, double purchasedForPrice, double sellPrice, GuitarType guitarType, String finish, GuitarString guitarString) {
        super(category, purchasedForPrice, sellPrice);
        this.guitarType = guitarType;
        this.finish = finish;
        this.guitarString = guitarString;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public String getFinish() {
        return finish;
    }

    public GuitarString getGuitarString(){
        return guitarString;
    }

    public String play(){
        return "Strum strum strum";
    }

}
