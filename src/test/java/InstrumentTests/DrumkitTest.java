package InstrumentTests;

import Instruments.Drumkit;
import Instruments.InstrumentCategory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumkitTest {

    Drumkit drumkit;

    @Before
    public void setUp(){
        drumkit = new Drumkit(InstrumentCategory.PERCUSSION, 150, 250, "Yamaha", 5, "Mother of Pearl");
    }

    @Test
    public void checkNoise(){
        assertEquals("Boom boom ch", drumkit.play());
    }

    @Test
    public void checkMarkUp(){
        assertEquals(100, drumkit.calculateMarkUp(), 0.01);
    }

}
