package ua.sourceit.javabasic.TaskArrays;

/**
 * Дана последовательность действительных чисел a1, a2, ..., an.
 * Выяснить, будет ли она возрастающей.
 * Created by user on 12.08.2015.
 */
public class Task4 {
    public static void main(String[] args) {
        double[] arr = new double[]{2.0, 3.0, 5, 6, 7};
//        double[] arr = new double[100];
//
//        for (int n = 0; n < arr.length; n++) {
//            arr[n] = (Math.random());
//            System.out.print(" " + arr[n]);
//            if (n % 20 == 0) {
//                System.out.println(" ");
//            }
//        }
        printArr(arr);
        System.out.println("возрастающая последовательность:" + increasingSequence(arr));

    }

    public static boolean increasingSequence(double[] array) {
        // Arrays.sort(array);
        if (array[0] < array[1]) {
            return true;
        }
        return false;
    }

    public static void printArr(double[] arr) {
        for (int n = 0; n < arr.length; n++) {
            System.out.print(" " + arr[n] + " ");
            if (n % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}

