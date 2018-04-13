public class Bedroom extends Room{

    private RoomType roomType;

    public Bedroom(String name, RoomType roomType) {
        super(name);
        this.roomType = roomType;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }





}
