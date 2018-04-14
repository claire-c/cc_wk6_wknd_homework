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

}
