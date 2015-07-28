package my_car;

/**
 * Created by user on 22.07.2015.
 */
public abstract class PublicCar extends Car{
    public String drive() {
        if(isDrive()){
            return "Машина уже едет";
        }
        setIsDrive(true);
        return "Машина начинает ехать";
    }

    public String stop() {
        return null;
    }

    public String start() {
        if(isStart()){
            return "Двигатель работает!";
        }
        setIsStart(true);
        return "Трахххх, бах! Завелся";
    }

    public String playMusic() {
        if (isPlayMusic()){
        return "Буц, буц! Уже играет!";
    }
    setIsPlayMusic(true);

    return "начало играть!";
}
}
