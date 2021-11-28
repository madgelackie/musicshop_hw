package OtherStock;

public class InstructionBook extends OtherStockItems {
    private String forWhichInstrument;
    private String level;

    public InstructionBook(double purchasedForPrice, double sellPrice, String forWhichInstrument, String level) {
        super(purchasedForPrice, sellPrice);
        this.forWhichInstrument = forWhichInstrument;
        this.level = level;
    }

    public String getForWhichInstrument() {
        return forWhichInstrument;
    }

    public void setForWhichInstrument(String forWhichInstrument) {
        this.forWhichInstrument = forWhichInstrument;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
