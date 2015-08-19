package ua.sourceit.javabasic.TaskArrays;

import java.util.ArrayList;

/**
 * Дана последовательность натуральных чисел a1, a2, ..., an.
 * Создать массив из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
 * Created by user on 13.08.2015.
 */
public class Task5 {


    public static void main(String[] args) {
        int[] arr = new int[100];
        int k = 3;
        ArrayList evenConsistency = new ArrayList();
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 100);
            System.out.print(" " + arr[n]);
            if (n % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("" + "----------------------------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenConsistency.add(arr[i]);
            }
        }
        if (evenConsistency.isEmpty()) {
            System.out.println("no even sequences");
        } else {
            for (int i = 0; i < evenConsistency.size(); i++) {
                System.out.print(" " + evenConsistency.get(i));
            }
        }
    }
}






