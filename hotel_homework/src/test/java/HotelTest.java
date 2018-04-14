import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Hotel fullHotel;
    private Guest skintGuest;
    private Guest richGuest;
    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;
    private ConferenceRoom conferenceRoom;
    private Lounge lounge;


    @Before
    public void before(){
        hotel = new Hotel("Happiness Hotel", 0.0);
        skintGuest = new Guest("Jon", 0.0);
        richGuest = new Guest("Claire", 100.0);
        singleBedroom = new Bedroom("1", RoomType.SINGLE, 25.0);
        doubleBedroom = new Bedroom("2", RoomType.DOUBLE, 50.0);
        conferenceRoom = new ConferenceRoom("conference", 100, 500.0);
        lounge = new Lounge("lounge", 50);

        fullHotel = new Hotel("full", 100.0);
        fullHotel.addConferenceRoom(conferenceRoom);
        fullHotel.addBedroom(singleBedroom);
        fullHotel.addBedroom(doubleBedroom);
        fullHotel.addOtherRoom(lounge);

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

    @Test
    public void canAddOtherRoom(){
        hotel.addOtherRoom(lounge);
        assertEquals(1, hotel.getOtherRooms().size());
    }

    @Test
    public void canCheckInGuestToSingleBedroom(){
        fullHotel.checkInGuest(richGuest, singleBedroom);
        assertEquals(1, singleBedroom.getOccupants().size());
    }

    @Test
    public void canCheckInGuestToDoubleBedroom(){
        fullHotel.checkInGuest(richGuest, doubleBedroom);
        assertEquals(1, doubleBedroom.getOccupants().size());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        fullHotel.checkInGuest(skintGuest, conferenceRoom);
        assertEquals(1, conferenceRoom.getOccupants().size());
    }

    @Test
    public void canCheckInGuestToLounge(){
        fullHotel.checkInGuest(skintGuest, lounge);
        assertEquals(1, lounge.getOccupants().size());
    }

    @Test
    public void canCheckOutAnyGuest(){
        fullHotel.checkInGuest(skintGuest, singleBedroom);
        fullHotel.checkOutAnyGuest(singleBedroom);
        fullHotel.checkInGuest(richGuest, conferenceRoom);
        fullHotel.checkOutAnyGuest(conferenceRoom);
        assertEquals(0, singleBedroom.getNumberOfOccupants());
        assertEquals(0, conferenceRoom.getNumberOfOccupants());
    }

    @Test
    public void checkOutAnyGuestWontBreakWhenRoomEmpty(){
        fullHotel.checkOutAnyGuest(conferenceRoom);
        assertEquals(0, conferenceRoom.getNumberOfOccupants());
    }






}
