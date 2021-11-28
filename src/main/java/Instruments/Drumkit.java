package Instruments;


import Behaviours.IPlay;

public class Drumkit extends Instrument implements IPlay {
    private String brand;
    private int size;
    private String finish;

    public Drumkit(InstrumentCategory category, double purchasedForPrice, double sellPrice, String brand, int size, String finish) {
        super(category, purchasedForPrice, sellPrice);
        this.brand = brand;
        this.size = size;
        this.finish = finish;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getFinish() {
        return finish;
    }

    public String play(){
        return "Boom boom ch";
    }
}
