package ua.sourceit.javabasic.TaskStrings;

/**
 * Дана строка. Подсчитать количество букв k в последнем ее слове.
 * Created by user on 16.08.2015.
 */
public class TaskStr10 {

	public static void main(String[] args) {

		String str = new String("asdfff ssddd kkk skkkrrrrkk");
		String[] tmp = str.split(" ");
		int len = tmp.length;
		int kCount = 0;
		for (char ch : tmp[len - 1].toCharArray()) {
			if (ch == 'k') {
				kCount++;
			}
		}
		System.out.println(kCount);

	}

}
