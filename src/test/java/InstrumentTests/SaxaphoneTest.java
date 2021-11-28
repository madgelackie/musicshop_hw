package InstrumentTests;

import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {
    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone(InstrumentCategory.WOODWIND, 500, 650, SaxophoneType.TENOR, "Selmer Paris");
    }

    @Test
    public void checkNoise(){
        assertEquals("Toot a-toot a-toot", saxophone.play());
    }

    @Test
    public void checkMarkUp(){
        assertEquals(150, saxophone.calculateMarkUp(), 0.01);
    }
}


