package codeclan.com.musicshop;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.musicshop.instruments.Brass;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class TestBrass{
    Brass trombone;

    @Before
        public void before(){
        trombone = new Brass("Trombone", 60.60, 80.00, "Slide");
    }

    @Test
    public void canPlay(){
            assertEquals("Brass sound", trombone.play());
    }

    @Test
    public void canGetName(){
            assertEquals("Trombone", trombone.getName());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(60.60, trombone.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(80.00, trombone.getSellPrice(), 0.01);
    }

    @Test
    public void canGetType(){
        assertEquals("Slide", trombone.canGetType());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(19.40, trombone.getMarkUp(trombone.getSellPrice(), trombone.getBuyPrice()), 0.01);
    }
}
