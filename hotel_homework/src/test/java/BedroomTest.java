import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BedroomTest {

    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;
    private Guest guest;

    @Before
    public void before() {
        singleBedroom = new Bedroom("13", RoomType.SINGLE, 25.0);
        doubleBedroom = new Bedroom("10", RoomType.DOUBLE, 50.0);
        guest = new Guest("Claire", 50.0);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, singleBedroom.getRoomType());
        assertEquals(RoomType.DOUBLE, doubleBedroom.getRoomType());
    }

    @Test
    public void canGetName(){
        assertEquals("13", singleBedroom.getName());
        assertEquals("10", doubleBedroom.getName());
    }

    @Test
    public void canGetOccupantsCount(){
        assertEquals(0, singleBedroom.getOccupants().size());
        assertEquals(0, doubleBedroom.getOccupants().size());
    }

    @Test
    public void canGetRoomRate(){
        assertEquals(25.0, singleBedroom.getRoomRate(), 0.1);
        assertEquals(50.0, doubleBedroom.getRoomRate(), 0.1);
    }

    @Test
    public void canAddOccupant(){
       singleBedroom.addOccupant(guest);
       assertEquals(1, singleBedroom.getOccupants().size());
    }

    @Test
    public void canGetNumberOfOccupants(){
         singleBedroom.addOccupant(guest);
         assertEquals(1, singleBedroom.getNumberOfOccupants());
    }

    @Test
    public void isRoomFullFalse(){
        assertFalse(singleBedroom.isRoomFull());
    }

    @Test
    public void isRoomFullTrue(){
        singleBedroom.addOccupant(guest);
        assertTrue(singleBedroom.isRoomFull());
    }



}
