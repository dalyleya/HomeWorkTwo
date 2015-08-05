package ua.sourceit.javabasic.task1;

import java.lang.reflect.Array;

/**
 * Разместить в памяти массив из 20 элементов и
 * заполнить его рядом Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, …
 * В этом ряду каждое следующее число является суммой двух предыдущих.
 * Created by user on 04.08.2015.
 */
public class Task6 {
    public static void main(String[] args) {
        fibonacciInCycle();
    }

    public static void fibonacciInCycle() {
        int[] fibArr = new int[20];
        fibArr[0] = 1;
        fibArr[1] = 1;

        System.out.print("ряд Фибоначчи-> " + Array.getInt(fibArr, 0) + " " + Array.getInt(fibArr, 1));
        for (int i = 2; i < 20; i++) {

            fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
            System.out.print(" " + Array.getInt(fibArr, i) + " ");
        }

    }
}
