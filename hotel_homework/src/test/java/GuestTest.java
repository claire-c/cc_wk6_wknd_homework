import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest skintGuest;
    private Guest richGuest;
    private Bedroom singleBedroom;
    private Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel("hotel", 0.0);
        singleBedroom = new Bedroom("1", RoomType.SINGLE, 25.0);
        skintGuest = new Guest("Simon", 0.0);
        richGuest = new Guest("Claire", 100.0);

        hotel.addBedroom(singleBedroom);
    }

    @Test
    public void canGetName(){
        assertEquals("Simon",skintGuest.getName());
        assertEquals("Claire", richGuest.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(0.0, skintGuest.getWallet(), 0.1);
        assertEquals(100.0, richGuest.getWallet(), 0.1);
    }

    @Test
    public void guestCanPayForRoom(){
        richGuest.payForRoom(singleBedroom);
        assertEquals(75.0, richGuest.getWallet(), 0.1);
    }

    @Test
    public void guestCannotPayForRoom(){
        skintGuest.payForRoom(singleBedroom);
        assertEquals(0.0, skintGuest.getWallet(), 0.1);
    }




}
