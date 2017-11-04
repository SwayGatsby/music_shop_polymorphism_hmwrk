package codeclan.com.musicshop;

import java.util.ArrayList;

import codeclan.com.musicshop.behaviours.Sellable;

/**
 * Created by user on 04/11/2017.
 */

public class Shop {

    private ArrayList<Sellable> stock;

    public Shop(ArrayList stock){
        this.stock = stock;
    }

    public void addStock(Sellable stockItem){
        stock.add(stockItem);
    }

    public int getStockLength() {
        return stock.size();
    }

    public void deleteStock(Sellable stockItem){
        stock.remove(stockItem);
    }

    public double getTotalPotentialProfitOfStock(){
        double totalProfit = 0;

        for (Sellable stockItem: stock){
            totalProfit += stockItem.getMarkUp(stockItem.getSellPrice(), stockItem.getBuyPrice());
        }
        return totalProfit;
    }

}












