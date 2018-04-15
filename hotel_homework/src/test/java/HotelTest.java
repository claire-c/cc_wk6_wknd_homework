import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    private Hotel hotel;
    private Hotel fullHotel;
    private Guest skintGuest;
    private Guest richGuest;
    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;
    private ConferenceRoom conferenceRoom;
    private OtherRoom lounge;
    private ConferenceRoom tinyConferenceRoom;
    private OtherRoom tinyLounge;


    @Before
    public void before(){
        hotel = new Hotel("Happiness Hotel", 0.0);
        skintGuest = new Guest("Jon", 0.0);
        richGuest = new Guest("Claire", 100.0);
        singleBedroom = new Bedroom("1", RoomType.SINGLE, 25.0);
        doubleBedroom = new Bedroom("2", RoomType.DOUBLE, 50.0);
        conferenceRoom = new ConferenceRoom("conference", 100, 500.0);
        lounge = new OtherRoom("lounge", 50);
        tinyConferenceRoom = new ConferenceRoom("tiny", 1, 5.0);
        tinyLounge = new OtherRoom("tiny lounge", 1);

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

    @Test
    public void canCheckOutNamedGuest(){
        fullHotel.checkInGuest(skintGuest, lounge);
        fullHotel.checkInGuest(richGuest, lounge);
        fullHotel.checkOutNamedGuest("Jon", lounge);
        assertEquals(1, lounge.getNumberOfOccupants());
    }

    @Test
    public void canGetGuestList(){
        fullHotel.checkInGuest(richGuest, doubleBedroom);
        fullHotel.checkInGuest(skintGuest, doubleBedroom);
        assertEquals(2, fullHotel.getGuestList(doubleBedroom).size());
    }

//    @Test
//    public void canCheckConferenceRoomCapacityRoomNotFull(){
//         assertTrue(fullHotel.checkConferenceRoomCapacity(conferenceRoom));
//    }

//    @Test
//    public void canCheckConferenceRoomCapacityFull(){
//        tinyConferenceRoom.addOccupant(skintGuest);
//        assertFalse(fullHotel.checkConferenceRoomCapacity(tinyConferenceRoom));
//    }
//
//    @Test
//    public void canCheckOtherRoomCapacityEmpty(){
//        assertTrue(fullHotel.checkOtherRoomCapacity(lounge));
//    }
//
//    @Test
//    public void canCheckOtherRoomCapacityFull(){
//        fullHotel.checkInGuest(skintGuest, tinyLounge);
//        assertFalse(fullHotel.checkOtherRoomCapacity(tinyLounge));
//    }
//
//




}
