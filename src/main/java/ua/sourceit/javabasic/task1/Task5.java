package ua.sourceit.javabasic.task1;

/**
 * Подсчитать, сколько шестизначных цифр имеют
 * равную сумму трех первых и трех последних цифр.
 * Created by user on 04.08.2015.
 */
public class Task5 {
    public static void main(String[] args) {
        digitsSumthree();
    }

    public static void digitsSumthree() {

        int count = 0;

        for (int i = 100000; i <= 999999; i++) {
            if (((i / 100000) % 10) + ((i / 10000) % 10) + ((i / 1000) % 10) == ((i / 100) % 10) + ((i / 10) % 10) + i % 10) {
                count++;

            }

        }
        System.out.println("суммa трех первых и трех последних цифр" + count);
    }
}
