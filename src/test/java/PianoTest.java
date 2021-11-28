import Instruments.InstrumentCategory;
import Instruments.Piano;
import Instruments.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano(InstrumentCategory.PIANO, 2000, 2500, PianoType.UPRIGHT, "Steinway & Sons");
    }

    @Test
    public void checkNoise(){
        assertEquals("tinkle tinkle", piano.play());
    }

    @Test
    public void checkMarkUp(){
        assertEquals(500, piano.calculateMarkUp(), 0.01);
    }

}
