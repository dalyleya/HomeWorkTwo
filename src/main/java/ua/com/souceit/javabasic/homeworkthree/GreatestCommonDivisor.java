package ua.com.souceit.javabasic.homeworkthree;

import java.lang.reflect.Array;

/**
 * GCD: метод, который находит наибольший общий делитель двух целых положительных чисел.
 * iSumNumb: Написать программу, которая находит сумму цифр произвольного целого числа.
 * isSimpleDigits: Mетод проверки того, что заданное число Х – простое (т.е. не делится без остатка ни на какие числа, кроме себя и 1).
 * Число X задавать в коде программы.
 * Created by HonestX on 25.07.2015.
 */
public class GreatestCommonDivisor {

    @Override
    public String toString() {

        return getClass().getSimpleName();

    }

    public static int GCD(int x, int y) {

        while (x != y) {
            if (x > y)
                x = x - y;
            else y = y - x;
        }
        return x;
    }

    public static int iSumNumb(int numb) {

        if (numb <= 9) {
            return numb;
        }

        int sum = numb % 10;

        return sum += iSumNumb(numb / 10);
    }

    static boolean isSimpleDigits(int numb) {
        if (numb == 1)                // не простое число
            return false;
        // перебираем возможные делители от 2 до sqrt(n)
        for (int d = 2; d * d <= numb; d++) {
            // если разделилось нацело, то составное
            if (numb % d == 0)
                return false;
        }
        // если нет нетривиальных делителей, то простое
        return true;
    }

    public static int customFuct(int arrg) {
        int sum = 1;
        for (int i = 2; i <= arrg; i++) {
            if (i % 2 == 0) {
                sum += (sum * i) * (-1);
            }
            sum += sum * i;
        }
        return sum;
    }

    public static int customFuctElse(int arrg) {
        int fact;
        if (arrg == 0 || arrg == 1) {
            return 1;
        }
        if (arrg % 2 == 0) {
            fact = (customFuct(arrg - 1) * arrg) * (-1);
        }
        fact = customFuct(arrg - 1) * arrg;
        return fact;
    }

    public static void digitsSumthree() {

        int count = 0;

        for (int i = 100000; i <= 999999; i++) {
            if (((i / 100000) % 10) + ((i / 10000) % 10) + ((i / 1000) % 10) == ((i / 100) % 10) + ((i / 10) % 10) + i % 10) {
                count++;

            }

        }
        System.out.println("Задание №3: " + count);
    }

    public static void fibonacciInCycle() {
        int[] fibArr = new int[20];
        fibArr[0] = 1;
        fibArr[1] = 1;

        System.out.print("Задание №1.6-> " + Array.getInt(fibArr, 0) + " " + Array.getInt(fibArr, 1));
        for (int i = 2; i < 20; i++) {

            fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
            System.out.print(" " + Array.getInt(fibArr, i) + " ");
        }

    }

}

