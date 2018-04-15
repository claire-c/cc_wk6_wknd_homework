public class OtherRoom extends Room {

    private int capacity;

    public OtherRoom(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean isRoomFull(){
        if (getNumberOfOccupants() < getCapacity()){
            return false;
        }
        else{
            return true;
        }
    }

    public double getRoomRate(){
        return 0.0;
    }




}
