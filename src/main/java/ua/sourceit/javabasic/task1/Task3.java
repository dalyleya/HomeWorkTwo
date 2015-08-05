package ua.sourceit.javabasic.task1;

/**
 * Написать программу проверки того, что заданное
 * число Х – простое (т.е. не делится без остатка ни на какие
 * числа, кроме себя и 1). Число X задавать в коде
 * программы.
 * Created by user on 04.08.2015.
 */
public class Task3 {
    public static void main(String[] args) {
        int i = 12;
        System.out.println(i + " is simple digit? " + isSimpleDigits(i));
    }

    public static boolean isSimpleDigits(int numb) {
        if (numb == 1)                // не простое число
            return false;
        // перебираем возможные делители от 2 до sqrt(n)
        for (int d = 2; d * d <= numb; d++) {
            // если разделилось нацело, то составное
            if (numb % d == 0)
                return false;
        }
        // если нет нетривиальных делителей, то простое
        return true;
    }
}
