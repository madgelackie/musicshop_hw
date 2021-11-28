package OtherStock;

public class GuitarStrings extends OtherStockItems {
    private int packSize;
    private String material;

    public GuitarStrings(double purchasedForPrice, double sellPrice, int packSize, String material) {
        super(purchasedForPrice, sellPrice);
        this.packSize = packSize;
        this.material = material;
    }

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
