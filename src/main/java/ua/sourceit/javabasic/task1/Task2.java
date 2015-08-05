package ua.sourceit.javabasic.task1;

/**
 * Написать программу, которая находит сумму цифр произвольного целого числа.
 * Created by user on 04.08.2015.
 */
public class Task2 {
    public static void main(String[] args) {
        int numb = 12348893;
        System.out.println("numb = " + numb + "; sum digits = " + iSumNumb(numb) + ";");

    }

    public static int iSumNumb(int numb) {

        if (numb <= 9) {
            return numb;
        }

        int sum = numb % 10;

        sum += iSumNumb(numb / 10);
        return sum;
    }
}
