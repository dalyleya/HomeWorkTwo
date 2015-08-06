package ua.sourceit.javabasic.task1;

/**
 * Создать "треугольный" массив из 10 строк и
 * заполнить его биномиальными коэффициентами
 * (треугольник Паскаля)
 * 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * Created by user on 04.08.2015.
 */
public class Task10 {
    public static void main(String[] args) {

        printTriangleOfPascal(10);
    }

    public static void printTriangleOfPascal(int numStr) {
        int[][] array = new int[numStr][];
        int a = 1;
        for (int n = 0; n < numStr; n++) {
            array[n] = new int[a++];
            for (int m = 0; m < array[n].length; m++) {
                // Вычисляеться биноминальный коэффициент по формуле - n!/m!(n-m)!
                array[n][m] = getFact(n) / (getFact(m) * getFact((n - m)));
            }
        }
        for (int n = 0; n < numStr; n++) {
            for (int m = 0; m < array[n].length; m++) {
                System.out.print(array[n][m] + " ");
            }
            System.out.println();
        }
    }

    // Метод вычисления фаткориала используеться для подсчета биноминального коэффициента
    public static int getFact(int fac) {
        int res = 1;
        for (int i = 1; i <= fac; i++)
            res *= i;
        return res;
    }


}
