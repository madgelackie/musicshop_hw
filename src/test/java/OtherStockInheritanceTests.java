import Instruments.Guitar;
import Instruments.Instrument;
import OtherStock.GuitarPedal;
import OtherStock.GuitarPedal;
import OtherStock.GuitarStrings;
import OtherStock.InstructionBook;
import OtherStock.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherStockInheritanceTests {
    GuitarPedal guitarPedal;

    @Before
    public void setUp(){
        guitarPedal = new GuitarPedal(75, 100, "Heavy Distortion", "thick, sludgy distortion");
    }

    @Test
    public void checkMarkUp(){
        assertEquals(25, guitarPedal.calculateMarkUp(), 0.01);
    }



}
