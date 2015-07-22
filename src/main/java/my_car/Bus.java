package my_car;

/**
 * Created by user on 22.07.2015.
 */
public class Bus extends PublicCar {
    int clientNumber;
    int ticketPrice;


    public Bus(int clientNumber, int ticketPrice){
        this.clientNumber = clientNumber;
        this.ticketPrice = ticketPrice;
    }


    @Override
    public String getInfo() {
        return "you are in bus, clientNumber = " + clientNumber + " ticket price = " + ticketPrice;
    }

    @Override
    public String toString(){
        return "";
    }

}
