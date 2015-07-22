/**
 * Created by user on 22.07.2015.
 */
public interface Passenger {
    int[] setAdress(int x, int y);
    void callTaxi(int x,int y);
    boolean sitInTaxi();
    boolean intoPlace();
    void exit();
}
