import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OtherRoomTest {

    private OtherRoom lounge;
    private OtherRoom broomCupboard;
    private Guest guest;

    @Before
    public void before(){
        lounge = new OtherRoom("Chillax", 50);
        guest = new Guest("Claire", 50.0);
        broomCupboard = new OtherRoom("cupboard", 1);
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

    @Test
    public void canGetNumberOfOccupants(){
        lounge.addOccupant(guest);
        assertEquals(1, lounge.getNumberOfOccupants());
    }

    @Test
    public void canCheckRoomCapacityEmpty(){
        assertTrue(lounge.checkRoomCapacity());
    }

    @Test
    public void canCheckRoomCapacityFull(){
        broomCupboard.addOccupant(guest);
        assertFalse(broomCupboard.checkRoomCapacity());
    }



}
