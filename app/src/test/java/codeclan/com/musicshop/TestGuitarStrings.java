package codeclan.com.musicshop;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.musicshop.accessories.guitarAccessories.GuitarStrings;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class TestGuitarStrings {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Electric Guitar Strings", 2.80, 5.99);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Electric Guitar Strings", guitarStrings.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(2.80, guitarStrings.getBuyPrice());
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(5.99, guitarStrings.getSellPrice());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(3.19, guitarStrings.getMarkUp(guitarStrings.getSellPrice(), guitarStrings.getBuyPrice()), 0.02);
    }

}