import java.util.ArrayList;
import java.util.Iterator;

public class Hotel {

    private String name;
    private double till;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Room> otherRooms;

    public Hotel(String name, double till){
        this.name = name;
        this.till = till;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.otherRooms = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public double getTill(){
        return this.till;
    }

    public ArrayList<Bedroom> getBedrooms(){
        return this.bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms(){
        return this.conferenceRooms;
    }

    public ArrayList<Room> getOtherRooms(){
        return this.otherRooms;
    }

    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

    public void addOtherRoom(Room lounge){
        otherRooms.add(lounge);
    }

    public void checkInGuest(Guest guest, Room room){
        if(room.isRoomFull() == false) {
            room.addOccupant(guest);
        }
    }

    public void checkOutAnyGuest(Room room){
        if (room.getNumberOfOccupants() > 0 ){
            room.getOccupants().remove(0);
        }
    }

    public void checkOutNamedGuest(String nameOfGuest, Room room){

        Iterator<Guest> guestList = room.getOccupants().iterator();

        if(room.getNumberOfOccupants() > 0 ) {

            while (guestList.hasNext()) {
                Guest occupant = guestList.next();
                if (occupant.getName() == nameOfGuest) {
                    guestList.remove();
                }
            }
        }

//        for (Guest occupant : room.getOccupants()){
//            if (occupant.getName() == nameOfGuest){
//                int index = room.getOccupants().indexOf(occupant);
//                room.getOccupants().remove(index);
//            }
//
//        }
    }


    public ArrayList<Guest> getGuestList(Room room){
        return room.getOccupants();
    }

    public void takeRoomPayment(Guest guest, Room room){
        double payment = guest.payForRoom(room);
        till += payment;
    }




}
