public class Guest {

    private String name;
    private double wallet;

    public Guest(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public double payForRoom(Room room){
        if(room.getRoomRate() < wallet){
                wallet -= room.getRoomRate();
                return room.getRoomRate();
            }
            else{
            return 0.0;
        }
    }


}
