package codeclan.com.musicshop.behaviours;

/**
 * Created by user on 04/11/2017.
 */

public interface Sellable {

    double getMarkUp(double sellPrice, double buyPrice);

    double getSellPrice();

    double getBuyPrice();
}
