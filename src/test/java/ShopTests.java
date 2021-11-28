import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.GuitarString;
import Instruments.GuitarType;
import Instruments.InstrumentCategory;
import OtherStock.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTests {

    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        shop  = new Shop();
        guitar = new Guitar(InstrumentCategory.STRING, 75, 160, GuitarType.CLASSICAL, "walnut", GuitarString.SIX);
        guitarStrings = new GuitarStrings(2.50, 3.25, 12, "nylon");
    }

    @Test
    public void addToStock(){
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void removeFromStock(){
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        shop.removeStock(guitarStrings);
        assertEquals(1, shop.getStock().size());
    }


}
