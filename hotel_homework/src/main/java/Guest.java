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

    public boolean canPay(Room room){
        if(room.getRoomRate() <= wallet){
            return true;
        }else{
            return false;
        }
    }

    public double payForRoom(Room room){
        if(canPay(room) == true){
                wallet -= room.getRoomRate();
                return room.getRoomRate();
            }
            else{
            return 0.0;
        }
    }


}
