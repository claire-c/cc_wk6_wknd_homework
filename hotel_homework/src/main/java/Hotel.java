import java.util.ArrayList;

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

    public void checkInGuest(Guest guest, Room bedroom){
        bedroom.addOccupant(guest);
    }






}
