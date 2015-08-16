package ua.sourceit.javabasic.task2.shape;

/**
 * Создать класс "Окружность".
 * Класс должен иметь следующие поля:
 * 1) x, y - координаты центра окружности;
 * 2) radius - радиус окружности.
 * Класс должен иметь следующие методы:
 * 1) передвинуть окружность на dx и dy;
 * 2) проверить попадание заданной точки внутрь данной
 * окружности;
 * 3) проверить попадание другой окружности внутрь
 * данной;
 * 4) вывести на экран параметры окружности.
 * Created by user on 06.08.2015.
 */
public class Circle extends Shape {
    private double xCenterCord;
    private double yCenterCord;
    private double radius;

    public Circle(double xCenterCord, double yCenterCord, double radius) {
        this.xCenterCord = xCenterCord;
        this.yCenterCord = yCenterCord;
        this.radius = radius;
    }


    @Override
    public void move(double xCord, double yCord) {
        this.xCenterCord = xCord;
        this.yCenterCord = yCord;
    }

    public double getxCenterCord() {

        return xCenterCord;
    }

    public void setxCenterCord(double xCenterCord) {
        this.xCenterCord = xCenterCord;
    }

    public double getyCenterCord() {
        return yCenterCord;
    }

    public void setyCenterCord(double yCenterCord) {
        this.yCenterCord = yCenterCord;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Круг расположен в точках Х: " + xCenterCord + " Y: " + yCenterCord + " R-радиус: " + radius);
    }

    public boolean gettingPointIntoCircle(double xCord, double yCord) {

        return ((xCord <= (xCenterCord + radius)) || (xCord >= (xCenterCord - radius)) &&
                (yCord <= (yCenterCord + radius)) || (yCord >= (yCenterCord - radius)));
    }

    public boolean gettingCircleIntoCircle(double xCord, double yCord, double xRadius) {
        if (!gettingPointIntoCircle(xCord, yCord)) {
            return false;
        }
        if ((xCenterCord + radius) > (xCord + xRadius) & (yCenterCord + radius) > (yCord + xRadius)) {
            return true;
        }
        return false;
    }
}

