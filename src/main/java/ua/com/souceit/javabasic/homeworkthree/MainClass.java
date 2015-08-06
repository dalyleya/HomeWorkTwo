package ua.com.souceit.javabasic.homeworkthree;

/**
 * Created by user on 24.07.2015.
 */
public class MainClass {
    public static void main(String[] arg) {

        //long start = System.nanoTime();
        // System.out.println("Задание 1.1(50 vs 40) = " + GreatestCommonDivisor.GCD(50, 40));

        //  GreatestCommonDivisor.digitsSumthree();
        //  long end = System.nanoTime();
        // System.out.println("Время выполнения: "+(double)(end-start)/1000000000.0+ " наносекунд");
        // GreatestCommonDivisor.fibonacciInCycle();
        //System.out.println(GreatestCommonDivisor.customFuct(5));
        ChesBoard n = new ChesBoard(8);
        n.createBord(8);
    }
}
