/**
 * Created by Honest on 22.07.2015.
 */
 abstract class Transport {

    private int serialNumber;

    public Transport(int serialNumber) {
        this.serialNumber = serialNumber;

    }

    abstract void move(int x, int y);

    abstract void stop();

    abstract  String governmentNumber();
}
