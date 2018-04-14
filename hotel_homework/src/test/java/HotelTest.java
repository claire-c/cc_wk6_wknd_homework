import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest skintGuest;
    private Guest richGuest;
    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;


    @Before
    public void before(){
        hotel = new Hotel("Happiness Hotel", 0.0);
        skintGuest = new Guest("Simon", 0.0);
        richGuest = new Guest("Claire", 100.0);
        singleBedroom = new Bedroom("1", RoomType.SINGLE, 25.0);
        doubleBedroom = new Bedroom("2", RoomType.DOUBLE, 50.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Happiness Hotel",hotel.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(0.0, hotel.getTill(), 0.1);
    }

    @Test
    public void canGetEmptyBedroomList(){
        assertEquals(0, hotel.getBedrooms().size());
    }



}
