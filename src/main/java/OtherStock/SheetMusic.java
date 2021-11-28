package OtherStock;

public class SheetMusic extends OtherStockItems {
    private String forWhichInstrument;
    private String composer;

    public SheetMusic(double purchasedForPrice, double sellPrice, String forWhichInstrument, String composer) {
        super(purchasedForPrice, sellPrice);
        this.forWhichInstrument = forWhichInstrument;
        this.composer = composer;
    }

    public String getForWhichInstrument() {
        return forWhichInstrument;
    }

    public void setForWhichInstrument(String forWhichInstrument) {
        this.forWhichInstrument = forWhichInstrument;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }
}
