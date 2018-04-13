public class Lounge extends Room {

    private int capacity;

    public Lounge(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }


}
