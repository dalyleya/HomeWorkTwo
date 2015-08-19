package ua.sourceit.javabasic.TaskArrays;

import java.util.ArrayList;

/**
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 * Created by user on 12.08.2015.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        ArrayList arrZero = new ArrayList();
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
            if (arr[n] == 0) {
                System.out.print("arr[" + n + "] = " + arr[n] + " ");
            }
            if (n % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arrZero.add(i);
            }
        }
        System.out.println("*************************************");
        for (int i = 0; i < arrZero.size(); i++) {
            System.out.print(" " + arrZero.get(i));

        }
    }
}
