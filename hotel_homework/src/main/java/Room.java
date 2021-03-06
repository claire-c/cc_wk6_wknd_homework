import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> occupants;
    private String name;

    public Room(String name){
        this.name = name;
        this.occupants = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Guest> getOccupants() {
        return occupants;
    }

    public void addOccupant(Guest guest){
        occupants.add(guest);
    }

    public int getNumberOfOccupants(){
        return occupants.size();
    }

    public abstract boolean isRoomFull();

    public abstract double getRoomRate();












}
