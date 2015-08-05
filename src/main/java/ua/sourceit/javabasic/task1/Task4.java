package ua.sourceit.javabasic.task1;

/**
 * Сосчитать сумму ряда 1! - 2! + 3! – 4! + 5! - … + n!
 * для заданного числа n > 0. Чем шире диапазон возможных
 * значений n, тем лучше. Число n задавать в коде программы.
 * Created by user on 04.08.2015.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(customFuct(5));

    }

    public static int customFuct(int arrg) {
        int res = 0;
        int fact = 1;
        int sign = 1;

        for (int i = 1; i <= arrg; i++) {

            fact *= i * sign;

            res += fact;

            sign = -1;

        }
        return res;
    }
}

