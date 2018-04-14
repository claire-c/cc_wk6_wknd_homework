import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest skintGuest;
    private Guest richGuest;
    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;
    public ConferenceRoom conferenceRoom;


    @Before
    public void before(){
        hotel = new Hotel("Happiness Hotel", 0.0);
        skintGuest = new Guest("Simon", 0.0);
        richGuest = new Guest("Claire", 100.0);
        singleBedroom = new Bedroom("1", RoomType.SINGLE, 25.0);
        doubleBedroom = new Bedroom("2", RoomType.DOUBLE, 50.0);
        conferenceRoom = new ConferenceRoom("conference", 100, 500.0);
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
    public void canGetEmptyBedroomArrayList(){
        assertEquals(0, hotel.getBedrooms().size());
    }

    @Test
    public void canGetEmptyConferenceRoomArrayList(){
        assertEquals(0, hotel.getConferenceRooms().size());
    }

    @Test
    public void canGetEmptyRoomArrayList(){
        assertEquals(0, hotel.getOtherRooms().size());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(singleBedroom);
        assertEquals(1, hotel.getBedrooms().size());
    }


    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRooms().size());
    }


    @Test
    public void canGetPopulatedBedroomArrayList(){
        hotel.addBedroom(singleBedroom);
        assertEquals(1, hotel.getBedrooms().size());
    }

    @Test
    public void canGetPopulatedConferenceRoomArrayList(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRooms().size());
    }




}
