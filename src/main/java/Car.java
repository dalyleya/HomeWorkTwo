/**
 * Created by user on 22.07.2015.
 */
public class Car extends CityTransport implements Driver{
    private String carBrand;
    private String carModel;
   // private boolean foolTank;
   // private int Speed;
    private boolean brake;


    public void signal() {
        System.out.println("Biiii....Biiii!");
    }

    public void driveTo(int x, int y ) {

        move( x, y);
    }

    public void edDirectly() {
        cords[1]++;
        System.out.println("ed directly"+cords[0]);
    }

    public void driveBackTo() {

        cords[1]--;    }

    public void turnLeft() {
        int temp=cords[1];
        cords[0]=cords[1]-1;
        cords[1]=temp;
    }

    public void turnRight() {
        int temp=cords[1];
        cords[0]=cords[1]*(-1);
        cords[1]=temp;
    }

    public boolean parkingBrake(boolean brake) {
        this.brake=brake;

        if (brake==false){

            System.out.println("Parking Brake: drive(ON)");
            return false;
        }
        System.out.println("Parking Brake: drive(OFF)");
        return true;
    }

    public Car(String carBrand, String carModel, boolean foolTank) {
        super();
        this.carBrand = carBrand;
        this.carModel = carModel;
        //this.foolTank = foolTank;
        //this.Speed =0;
    }

    @Override
    void move(int x, int y) {
        while (cords[0]!=x && cords[1]!=y){


    }
    }

    @Override
    void stop() {
        super.stop();
        brake=true;
        parkingBrake(brake);
    }

    @Override
    public String governmentNumber() {
        return super.governmentNumber();
    }
}
