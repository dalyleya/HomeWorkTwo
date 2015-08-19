package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка. Определить, сколько раз входит в нее группа букв  abc .
 * Created by user on 16.08.2015.
 */
public class TaskStr9 {

	public static void main(String[] args) {

		String str = "abc fabcgabch bca abcabc fgh abc  abc";

		System.out.println(searchWord(str, "abc"));
	}

	public static int searchWord(String message, String word) {

		message = message.toLowerCase();
		word = word.toLowerCase();
		int i = message.indexOf(word);
		int count = 0;
		while (i >= 0) {
			count++;
			i = message.indexOf(word, i + 1);
		}
		return count;
	}
}
