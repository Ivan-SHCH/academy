package by.academy.homwork.hw2;

import java.util.Scanner;

public class StringHw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое слово: ");
		String word1 = sc.next();
		System.out.println("Введите второе слово: ");
		String word2 = sc.next();
		sc.close();
		System.out.println("Оба слова совпадают? - " + compare(word1, word2));
	}

	public static boolean compare(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		char[] arr = str1.toCharArray();
		int indexLetter = 0;
		for (int i = 0; i < arr.length; i++) {
			indexLetter = str2.indexOf(arr[i]);
			if (indexLetter != -1) {
				str2 = str2.substring(0, indexLetter) 
						+ str2.substring(indexLetter + 1, str2.length());
			} else {
				return false;
			}
		}
		return str2.isEmpty();
	}
}
