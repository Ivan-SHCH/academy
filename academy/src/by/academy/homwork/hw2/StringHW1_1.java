package by.academy.homwork.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class StringHW1_1 {

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

		int[] arr = new int[256];
		char[] str1_array = str1.toCharArray();
		
		for (char c : str1_array) {
			arr[c]++;
		}

		for (int i = 0; i < str2.length(); i++) {
			int valStr2 = (int) str2.charAt(i);
			if (--arr[valStr2] < 0) {
				return false;
			}
		}
		return true;
	}
}
