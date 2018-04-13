import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;

    @Before
    public void before() {
        singleBedroom = new Bedroom("13", RoomType.SINGLE);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, singleBedroom.getRoomType());
    }




}
