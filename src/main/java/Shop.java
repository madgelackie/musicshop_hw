import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addStock(ISell stockItem) {
        this.stock.add(stockItem);
    }

    public void removeStock(ISell stockItem) {
        this.stock.remove(stockItem);
    }

    public double totalStockCost() {
        double totalCost = this.stock.stream().mapToDouble(ISell::getPurchasedForPrice).sum();
        return totalCost;
    }

    public double totalPotentialSales(){
        double allSales = this.stock.stream().mapToDouble(ISell::getSellPrice).sum();
        return allSales;
    }

    public double maxProfit(){
        return totalPotentialSales() - totalStockCost();
    }

}




//    public double totalStockCost(){
//
//    }

