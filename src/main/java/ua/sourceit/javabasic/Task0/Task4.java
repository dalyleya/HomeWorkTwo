package ua.sourceit.javabasic.Task0;

/**
 * Дана последовательность действительных чисел a1, a2, ..., an.
 * Выяснить, будет ли она возрастающей.
 * Created by user on 12.08.2015.
 */
public class Task4 {
    public static void main(String[] args) {

        double[] arr = new double[100];
        int k = 3;
        int res = 0;
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (Math.random());
            System.out.print(" " + arr[n]);
            if (n % 20 == 0) {
                System.out.println(" ");
            }
        }

    }

    public boolean decreasingSequence() {
        return true;
    }
}

