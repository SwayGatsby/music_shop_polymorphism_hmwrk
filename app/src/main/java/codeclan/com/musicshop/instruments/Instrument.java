package codeclan.com.musicshop.instruments;

import codeclan.com.musicshop.behaviours.Playable;
import codeclan.com.musicshop.behaviours.Sellable;

/**
 * Created by user on 04/11/2017.
 */

public abstract class Instrument implements Playable, Sellable {
    protected String name;
    protected double buyPrice;
    protected double sellPrice;

    public Instrument(String name, double buyPrice, double sellPrice){
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return this.name;
    }

    public double getBuyPrice(){
        return this.buyPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public double getMarkUp(double sellPrice, double buyPrice){
        double markUp = sellPrice - buyPrice;
        return markUp;
    }
}

