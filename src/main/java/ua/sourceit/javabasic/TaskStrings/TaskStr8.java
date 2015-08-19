package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка. Преобразовать ее, удалив каждый символ * и повторив каждый символ, отличный от *.
 * Created by user on 16.08.2015.
 */
public class TaskStr8 {

	public static void main(String[] args) {

		String s;
		s = "q*w*e*r*t*y*";
		System.out.println(changeChar(s));
	}

	public static String changeChar(String str) {

		StringBuilder tmp = new StringBuilder(str.length() * 2);
		for (char ch : str.toCharArray()) {
			if (ch != '*') {
				tmp.append(ch).append(ch);

			}
		}

		return tmp.toString();
	}

}
