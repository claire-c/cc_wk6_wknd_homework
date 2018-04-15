public class OtherRoom extends Room {

    private int capacity;

    public OtherRoom(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean checkRoomCapacity(){
        if (getNumberOfOccupants() < getCapacity()){
            return true;
        }
        else{
            return false;
        }
    }




}
