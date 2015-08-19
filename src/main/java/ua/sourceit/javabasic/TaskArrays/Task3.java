package ua.sourceit.javabasic.TaskArrays;

/**
 * Дана последовательность целых чисел a1, a2, ..., an.
 * Выяснить, какое число встречается раньше – положительное или отрицательное.
 * Created by user on 12.08.2015.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, -8, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("первое отрицательное");
                break;
            }
            if (arr[i] > 0) {
                System.out.println("первое положительное");
                break;
            }
        }

    }
}
