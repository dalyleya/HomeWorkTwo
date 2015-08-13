package ua.sourceit.javabasic.Task0;

import java.util.ArrayList;

/**
 * Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
 * Created by user on 12.08.2015.
 */
public class Task1 {
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
                System.out.println(" " + evenConsistency.get(i));
            }
        }
    }
}

