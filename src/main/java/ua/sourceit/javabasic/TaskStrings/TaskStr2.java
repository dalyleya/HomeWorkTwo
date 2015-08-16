package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка, содержащая английский текст. Найти количество слов, начинающихся с буквы b.
 * Created by user on 16.08.2015.
 */
public class TaskStr2 {
    public static void main(String[] args) {
        String s = "ooo boo oo buuu bbb  vvvv     bbbbb     b   h  b     bbbbb bbb b  bbb b";
        System.out.println(bWord(s));
    }

    public static int bWord(String s) {
        int count = 0;
        for (int i = 1; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'b' & s.charAt(i - 1) == ' ') {
                count++;
            }
        }
        return count;
    }
}

