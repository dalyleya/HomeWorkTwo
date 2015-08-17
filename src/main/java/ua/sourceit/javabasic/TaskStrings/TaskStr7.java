package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка, содержащая текст, заканчивающийся точкой. Вывести на экран слова, содержащие три буквы.
 * Created by user on 16.08.2015.
 */
public class TaskStr7 {
    public static void main(String[] args) {
        String s = new String(" Про гра мист sss ass dddd fff . aaasssd sss");
        s = s.substring(0, s.indexOf('.'));
        String[] parts = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() == 3) {
                System.out.print(" " + parts[i]);
            }
        }
    }

}
