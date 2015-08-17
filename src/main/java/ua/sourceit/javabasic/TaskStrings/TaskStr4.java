package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка. Определить, сколько в ней символов  * ,  ; ,  : .
 * Created by user on 16.08.2015.
 */
public class TaskStr4 {
    public static void main(String[] args) {
        String s = "asdt***:::;;;    ttt rrrr:::::::: llllkjrrrr   rtk";
        System.out.println(chars(s));
    }

    public static int chars(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' || s.charAt(i) == ':' || s.charAt(i) == ';') {
                count++;
            }
        }
        return count;
    }
}
