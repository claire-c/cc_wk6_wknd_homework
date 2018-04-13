import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Ruby", 100, 500.0);
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



}
