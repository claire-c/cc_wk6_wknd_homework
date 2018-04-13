import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;

    @Before
    public void before() {
        singleBedroom = new Bedroom("13", RoomType.SINGLE);
        doubleBedroom = new Bedroom("10", RoomType.DOUBLE);
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




}
