import Instruments.Guitar;
import Instruments.GuitarString;
import Instruments.GuitarType;
import Instruments.InstrumentCategory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar(InstrumentCategory.STRING, 75, 160, GuitarType.CLASSICAL, "walnut", GuitarString.SIX);
    }

    @Test
    public void checkNoise(){
        assertEquals("Strum strum strum", guitar.play());
    }

    @Test
    public void checkMarkUp(){
        assertEquals(85, guitar.calculateMarkUp(), 0.01);
    }
}
