package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка. Подсчитать в ней количество вхождений букв r, k, t.
 * Created by user on 16.08.2015.
 */
public class TaskStr3 {
    public static void main(String[] args) {
        String s = "asdt    ttt rrrr llllkjrrrr   rtk";
        System.out.println(charRKT(s));
    }

    public static int charRKT(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'r' || s.charAt(i) == 'k' || s.charAt(i) == 't') {
                count++;
            }
        }
        return count;
    }
}
