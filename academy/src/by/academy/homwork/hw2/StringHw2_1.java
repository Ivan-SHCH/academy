package by.academy.homwork.hw2;

import java.util.Scanner;

public class StringHw2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("\\s+");
		sc.close();
		String s = null;
		int min = Integer.MAX_VALUE;
		String index = null;
		int subtract = 0;
		StringBuilder garbage = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			for (int n = i; n < arr[i].length(); n++) {
				s = String.valueOf(arr[i].charAt(n));
				if (garbage.indexOf(s) == -1) {
					garbage.append(s);
				}
			}

			if (arr[i].length() == garbage.length()) {
				index = arr[i];
				
			} else {
				subtract = arr[i].length() - garbage.length();
				if (min > subtract) {
					min = subtract;
					index = arr[i];
				}
			}
		}
		System.out.println("Слово в котором число повторяющихся "
				+ "символов минимально: " + index);

	}
}
