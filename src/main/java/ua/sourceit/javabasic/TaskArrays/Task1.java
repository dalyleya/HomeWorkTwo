package ua.sourceit.javabasic.TaskArrays;

/**
 * Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
 * Created by user on 12.08.2015.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int k = 3;
        int res = 0;
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
            if (arr[i] % k == 0) {
                res += arr[i];
            }
        }
        System.out.println(res);
    }
}
