package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка, заканчивающаяся точкой. Подсчитать, сколько в ней слов.
 * Created by user on 16.08.2015.
 */
public class TaskStr1 {
    public static void main(String[] args) {
        String s = "he llo wo rd me";
        System.out.println(stringToken(s));
    }

    public static int stringToken(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
