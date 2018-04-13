import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoungeTest {

    private Lounge lounge;

    @Before
    public void before(){
        lounge = new Lounge("Chillax", 50);
    }

    @Test
    public void getName(){
        assertEquals("Chillax",lounge.getName());
    }

    @Test
    public void confirmLoungeEmpty(){
        assertEquals(0, lounge.getOccupants().size());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(50, lounge.getCapacity());
    }





}
