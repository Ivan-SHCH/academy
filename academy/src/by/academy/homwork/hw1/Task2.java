package by.academy.homwork.hw1;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Введите тип данных:");
		String line = sc.next();

		switch (line) {
		case "integer":
			System.out.print("Введиите целое число: ");
			int intNumb = sc.nextInt();
			System.out.println("Остаток от деления на 2 равен: " + intNumb % 2);
			break;

		case "double":
			System.out.print("Введите число типа double: ");
			double doubNumb = sc.nextDouble();
			System.out.println("70% от  вашего чила равно: " + (1 - 0.7) * doubNumb);
			break;

		case "float":
			System.out.print("Введите число типа float: ");
			float numbFloat = sc.nextFloat();
			System.out.println(numbFloat + " в квадрате равно " 
								+ numbFloat * numbFloat);
			break;

		case "char":
			System.out.print("Введите любой символ: ");
			char charNumb = sc.next().charAt(0);
			System.out.println("Код вашего символа " + charNumb + " равен: " 
								+ (int) charNumb);
			break;

		case "string":
			System.out.print("Введите строку или имя: ");
			String str = sc.next();
			System.out.println("Hello " + str);
			break;
			
		default:
			System.out.println("Unsuported type!");
			break;
		}
		sc.close();
	}
}
