public class ConferenceRoom extends Room {

    private int capacity;
    private double roomRate;

    public ConferenceRoom(String name, int capacity, double roomRate){
        super(name);
        this.capacity = capacity;
        this.roomRate = roomRate;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getRoomRate(){
        return this.roomRate;
    }

    public boolean isRoomFull(){
        if (getNumberOfOccupants() < getCapacity()){
            return false;
        }
        else{
            return true;
        }
    }







}
