package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка символов, среди которых есть двоеточие (:). Определить, сколько символов ему предшествует.
 *
 * Created by user on 16.08.2015.
 */
public class TaskStr6 {
    public static void main(String[] args) {
        String s = new String("Програмист asddddfff: ");
        int charCount = 0;
        String[] parts = s.split(":");
        charCount = parts[0].length();
        System.out.println("charCount = " + charCount);
    }
}
