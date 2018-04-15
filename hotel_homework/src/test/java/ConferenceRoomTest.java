import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private ConferenceRoom tinyConferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Ruby", 100, 500.0);
        guest = new Guest("Claire", 50.0);
        tinyConferenceRoom = new ConferenceRoom("tiny", 1, 5.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Ruby", conferenceRoom.getName());
    }

    @Test
    public void canGetOccupants(){
        assertEquals(0, conferenceRoom.getOccupants().size());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetRoomRate(){
        assertEquals(500.0, conferenceRoom.getRoomRate(), 0.1);
    }

    @Test
    public void canAddOccupant(){
        conferenceRoom.addOccupant(guest);
        assertEquals(1, conferenceRoom.getOccupants().size());
    }

    @Test
    public void canGetNumberOfOccupants(){
        conferenceRoom.addOccupant(guest);
        assertEquals(1, conferenceRoom.getNumberOfOccupants());
    }

    @Test
    public void isRoomFullFalse(){
        assertFalse(conferenceRoom.isRoomFull());
    }

    @Test
    public void isRoomFullTrue(){
        tinyConferenceRoom.addOccupant(guest);
        assertTrue(tinyConferenceRoom.isRoomFull());
    }



}
