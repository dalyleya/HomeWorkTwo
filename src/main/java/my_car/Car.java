package my_car;

/**
 * Created by user on 22.07.2015.
 */
public abstract class Car implements ICar {
    private boolean isStart;
    private boolean isDrive;
    private boolean isPlayMusic;

    public boolean isStart() {
        return isStart;
    }

    public void setIsStart(boolean isStart) {
        this.isStart = isStart;
    }

    public boolean isDrive() {
        return isDrive;
    }

    public void setIsDrive(boolean isDrive) {
        this.isDrive = isDrive;
    }

    public boolean isPlayMusic() {
        return isPlayMusic;
    }

    public void setIsPlayMusic(boolean isPlayMusic) {
        this.isPlayMusic = isPlayMusic;
    }

    public abstract String getInfo();
}
