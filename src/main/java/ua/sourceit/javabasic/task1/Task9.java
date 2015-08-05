package ua.sourceit.javabasic.task1;

/**
 * Создать целый шестимерный массив с двумя
 * значениями в каждом измерении. Заполнить массив
 * числами из начала натурального ряда: 1, 2, 3, … Сказать,
 * сколько потребуется чисел
 * Created by user on 04.08.2015.
 */
public class Task9 {
    public static void main(String[] args) {
        Task9.printSixDArray();
    }

    public static void printSixDArray() {
        // Метод который заполняет шестимерный массив (с двумя значениями в каждом измерении)
        // числами из натурального ряда и выводит на консоль!
        int[][][][][][] array = new int[2][2][2][2][2][2];
        int val = 1;
        for (int a = 0; a < array.length; a++)
            for (int n = 0; n < array.length; n++)
                for (int d = 0; d < array.length; d++)
                    for (int r = 0; r < array.length; r++)
                        for (int e = 0; e < array.length; e++)
                            for (int y = 0; y < array.length; y++)
                                array[a][n][d][r][e][y] = val++;
        for (int[][][][][] anArray : array)
            for (int n = 0; n < array.length; n++)
                for (int d = 0; d < array.length; d++)
                    for (int r = 0; r < array.length; r++)
                        for (int e = 0; e < array.length; e++)
                            for (int y = 0; y < array.length; y++)
                                System.out.print(anArray[n][d][r][e][y] + " ");
    }
}
