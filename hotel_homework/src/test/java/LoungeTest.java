import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoungeTest {

    private Lounge lounge;
    private Guest guest;

    @Before
    public void before(){
        lounge = new Lounge("Chillax", 50);
        guest = new Guest("Claire", 50.0);
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

    @Test
    public void canAddOccupant(){
        lounge.addOccupant(guest);
        assertEquals(1, lounge.getOccupants().size());
    }



}
