package my_car;

/**
 * Created by user on 22.07.2015.
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Bus(40, 5);
        SportCar car2 = new SportCar();

        showAllCarsMethod(car2);
        showAllCarsMethod(car1);

    }


    public static void showAllCarsMethod(Car car){
        System.out.println(car.getInfo());
        System.out.println(car.start());
        System.out.println(car.isDrive());
        System.out.println(car.drive());
        System.out.println(car.isDrive());
        System.out.println(car.stop());
        System.out.println(car.playMusic());
    }
}
