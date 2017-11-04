package codeclan.com.musicshop;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.musicshop.accessories.brassAccessories.Oil;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class OilTest {

    Oil slideOil;

    @Before
    public void before(){
        slideOil = new Oil("Slide Oil", 4.50, 6.20);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Slide Oil", slideOil.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(4.50, slideOil.getBuyPrice());
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(6.20, slideOil.getSellPrice());
    }

    @Test
    public void canGetMarkUpPrice(){
        assertEquals(1.70, slideOil.getMarkUp(slideOil.getSellPrice(), slideOil.getBuyPrice()), 0.01);
    }

}
