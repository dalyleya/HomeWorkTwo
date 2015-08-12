package ua.sourceit.javabasic.task2.shape;

/**
 * Created by user on 12.08.2015.
 */


public class ShapeFX {

    public static void main(String[] args) {

        Shape circle = new Circle(50, 40, 120);
        Circle litCircle = new Circle(20, 23, 70);
        circle.draw();
        litCircle.draw();

    }
}
