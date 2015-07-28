package CityTransport;

/**
 * Created by user on 22.07.2015.
 */
public interface TaxiDriver extends Driver {

    void driveToCall(int[] cords);

    void driveToAdress(int[] cords);

    int getFare();

}
