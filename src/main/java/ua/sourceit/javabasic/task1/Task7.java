package ua.sourceit.javabasic.task1;

/**
 * Создать целый массив из 100 элементов и заполнить
 * его простыми числами: 2, 3, 5, 7, 11, 13, 17, …
 * Created by user on 04.08.2015.
 */
public class Task7 {
    public static void main(String[] args) {

    }

    public static int[] simpleDigits(int arrLength) {

        int[] simplDigits = new int[arrLength];

        int j = 1;

        for (int i = 0; i < arrLength; i++) {

            while (!Task3.isSimpleDigits(j)) {
                j++;
            }
            simplDigits[i] = j;
            j++;
        }
        return simplDigits;
    }
}
