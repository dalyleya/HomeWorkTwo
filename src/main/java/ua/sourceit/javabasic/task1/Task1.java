package ua.sourceit.javabasic.task1;

/**
 * Написать программу, которая находит наибольший общий делитель двух целых положительных чисел.
 * Created by user on 04.08.2015.
 */
public class Task1 {
    public static void main(String[] args) {
        int x = 50;
        int y = 25;
        System.out.println("GCD: x = " + x + "; " + "y = " + y + "; gcd = " + Task1.GCD(x, y));
    }

    public static int GCD(int x, int y) {

        while (x != y) {
            if (x > y)
                x = x - y;
            else y = y - x;
        }
        return x;
    }
}
