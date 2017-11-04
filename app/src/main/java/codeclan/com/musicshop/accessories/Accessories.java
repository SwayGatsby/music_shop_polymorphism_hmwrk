package codeclan.com.musicshop.accessories;

import codeclan.com.musicshop.behaviours.Sellable;

/**
 * Created by user on 04/11/2017.
 */


public abstract class Accessories implements Sellable {
    protected String description;
    protected double buyPrice;
    protected double sellPrice;

    public Accessories(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getMarkUp(double sellPrice, double buyPrice){
        double markUp = sellPrice - buyPrice;
        return markUp;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}



