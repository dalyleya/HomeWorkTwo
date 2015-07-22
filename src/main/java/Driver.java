/**
 * Created by user on 22.07.2015.
 */
public interface Driver {
    void signal();
    void driveTo(int x,int y);

    void edDirectly();
    void driveBackTo();
    void turnLeft();
    void turnRight();
    boolean parkingBrake(boolean brake);

}
