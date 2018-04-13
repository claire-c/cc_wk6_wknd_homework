public class Bedroom extends Room{

    private RoomType roomType;
    private double roomRate;

    public Bedroom(String name, RoomType roomType, double roomRate) {
        super(name);
        this.roomType = roomType;
        this.roomRate = roomRate;

    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public double getRoomRate(){
        return this.roomRate;
    }








}
