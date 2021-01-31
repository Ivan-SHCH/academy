package by.academy.homwork.hw2;

import java.util.Scanner;

public class StringHw2 {

	//	Задание 2. 
//	Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
//	Если таких слов несколько, найти первое из них.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		sc.close();
		compare(str);
	}

	public static void compare(String[] s) {
		long reapet = 0;
		String index1 = null;
		int length = 0;
		int prom = 0;
		long min = Integer.MAX_VALUE;
		
		for (int i = 0; i < s.length; i++) {
			reapet = s[i].chars().distinct().count(); 	//cheat  
			if (s[i].length() == reapet) {
				length = s[i].length();
				min = reapet;
				index1 = s[i];
			} else {
				prom = s[i].length() - (int) reapet;
				if (min > prom) {
					min = prom;
					index1 = s[i];
					length = s[i].length();
				}
			}
		}
		System.out.println("Количество повторяющихся символов в строке: " 
							+ min + ", ее значение " 
								+ index1 + ", длинна строки" + length);
	}
}
