package codeclan.com.musicshop.accessories.brassAccessories;

import codeclan.com.musicshop.accessories.Accessories;

/**
 * Created by user on 04/11/2017.
 */

public class Oil extends Accessories {
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Oil(String description, double buyPrice, double sellPrice) {
        super(description, buyPrice, sellPrice);
    }

}
