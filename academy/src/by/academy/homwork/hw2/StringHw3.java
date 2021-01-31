package by.academy.homwork.hw2;

import java.util.Scanner;

public class StringHw3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = null;
		String line2 = null;
		String cut = null;
		do {
			System.out.println("Введите два слова. Состаящие из четно числа букв:");
			line1 = sc.next();
			line2 = sc.next();
			if (line1.length() % 2 != 0 || line2.length() % 2 != 0) {
				System.out.println("Вы ввели слово состоящее из нечетного числа букв!");
			}
		} while (line1.length() % 2 != 0 || line2.length() % 2 != 0);
		
		sc.close();
		cut = line1.substring(0, line1.length() / 2)
				.concat(line2.substring(line2.length() / 2, line2.length()));
		System.out.println(cut);
	}
}
