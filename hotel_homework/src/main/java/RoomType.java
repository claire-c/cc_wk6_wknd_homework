public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    QUEEN(2),
    KING(2),
    FAMILY(4),
    SUITE(4);

    private final Integer capacity;

    RoomType(Integer capacity){
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return this.capacity;
    }


}