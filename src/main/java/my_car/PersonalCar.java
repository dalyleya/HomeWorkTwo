package my_car;

/**
 * Created by user on 22.07.2015.
 */
public class PersonalCar extends Car {

    public PersonalCar() {
        super();
    }

    @Override
    public boolean isStart() {
        return super.isStart();
    }

    @Override
    public void setIsStart(boolean isStart) {
        super.setIsStart(isStart);
    }

    @Override
    public boolean isDrive() {
        return super.isDrive();
    }

    @Override
    public void setIsDrive(boolean isDrive) {
        super.setIsDrive(isDrive);
    }

    @Override
    public boolean isPlayMusic() {
        return super.isPlayMusic();
    }

    public String stop() {
        return null;
    }

    @Override
    public void setIsPlayMusic(boolean isPlayMusic) {
        super.setIsPlayMusic(isPlayMusic);
    }

    public String drive() {
        return null;
    }

    public String start() {
        if(isStart()){
            return "Двигатель работает!";
        }
        setIsStart(true);
        return "Трахххх, бах! Завелся двигатель у моей крошки";
    }

    public String playMusic() {
        if (isPlayMusic()){
            return "Буц, буц дрынь-дрынь! Уже играет!";
        }
        setIsPlayMusic(true);

        return "начало играть! Музыка роковоггго направления";
    }


    @Override
    public String getInfo() {
        return null;
    }
}
