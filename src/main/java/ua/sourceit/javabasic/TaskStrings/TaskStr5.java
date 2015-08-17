package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка, содержащая текст. Найти длины самого короткого и самого длинного слов.
 * Created by user on 16.08.2015.
 */
public class TaskStr5 {
    public static void main(String[] args) {
        String s = new String();
        s = "abra kadabra";
        isMaxMinWordLen(s);
    }

    public static int[] isMaxMinWordLen(String str) {
        String[] parts = str.split(" ");
        int[] minMax = new int[2];
        minMax[0] = parts[0].length();

        for (int i = 0; i < parts.length; i++) {

            if (minMax[0] < parts[i].length()) {

                minMax[1] = parts[i].length();
            }
            if (minMax[0] >= parts[i].length()) {

                minMax[0] = parts[i].length();
            }
        }
        System.out.println("Minimal word length = " + minMax[0] + " Maximal word length = " + minMax[1]);
        return minMax;
    }
}
