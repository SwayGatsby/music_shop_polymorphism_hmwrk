package codeclan.com.musicshop;

import org.junit.Before;
import org.junit.Test;
import codeclan.com.musicshop.instruments.StringInstrument;
import codeclan.com.musicshop.instruments.StringInstrumentType;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class TestStringInstrument {
    StringInstrument ukulele;

    @Before
    public void before(){
        ukulele = new StringInstrument(StringInstrumentType.UKULELE,30.50, 60.00, 4, "Strum");
    }

    @Test
    public void canGetType(){
        assertEquals(StringInstrumentType.UKULELE, ukulele.getType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(30.50, ukulele.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(60.00, ukulele.getSellPrice(), 0.01);
    }

    @Test
    public void canGetNumOfStrings(){
        assertEquals(4, ukulele.getNumOfStrings());
    }

    @Test
    public void canGetPlayMethod(){
        assertEquals("Strum", ukulele.getPlayMethod());
    }

    @Test
    public void canPlay(){
        assertEquals("String sound", ukulele.play());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(29.50, ukulele.getMarkUp(ukulele.getSellPrice(), ukulele.getBuyPrice()), 0.01);
    }
}

