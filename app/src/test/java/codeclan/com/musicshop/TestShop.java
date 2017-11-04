package codeclan.com.musicshop;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import codeclan.com.musicshop.accessories.guitarAccessories.GuitarStrings;
import codeclan.com.musicshop.behaviours.Sellable;
import codeclan.com.musicshop.instruments.StringInstrument;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class TestShop {

    Shop shop;
    ArrayList stock;
    StringInstrument ukulele;
    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Electric guitar strings", 4.50, 7.99);
        ukulele = new StringInstrument("Ukulele", 50.50, 75.00, 4, "Strum");
//        ArrayList<Sellable> stock = new ArrayList<>();
        stock = new ArrayList<Sellable>();
        shop = new Shop(stock);
    }

    @Test
    public void canAddStock() {
        assertEquals(0, shop.getStockLength());
        stock.add(ukulele);
        shop.addStock(guitarStrings);
        assertEquals(2, shop.getStockLength());
    }

    @Test
    public void canDeleteStock() {
        stock.add(ukulele);
        stock.add(guitarStrings);
        assertEquals(2, shop.getStockLength());
        shop.deleteStock(ukulele);
        assertEquals(1, shop.getStockLength());
    }

    @Test
    public void cannotDeleteFromStockIfItemNotInStock() {
        shop.addStock(ukulele);
        assertEquals(1, shop.getStockLength());
        shop.deleteStock(guitarStrings);
        assertEquals(1, shop.getStockLength());
    }

    @Test
    public void cannotDeleteMoreThanOneOccurenceOfObjectAtATime(){
        shop.addStock(ukulele);
        shop.addStock(ukulele);
        assertEquals(2, shop.getStockLength());
        shop.deleteStock(ukulele);
        assertEquals(1, shop.getStockLength());
    }
}
