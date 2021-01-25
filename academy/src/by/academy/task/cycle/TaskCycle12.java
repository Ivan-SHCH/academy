package by.academy.task.cycle;

import java.util.Scanner;

public class TaskCycle12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Произведние двухзначных нечетных чисел кратных 13");
		System.out.print("Введите первое число: ");
		int number1 = sc.nextInt();
		System.out.print("Введите второе число: ");
		int number2 = sc.nextInt();
		int result = number1 * number2;
		
		if(result % 13 == 0) {
			System.out.println("Произведение двух чисел " + result + " кратно 13!");
		}
		sc.close();
	}
}
