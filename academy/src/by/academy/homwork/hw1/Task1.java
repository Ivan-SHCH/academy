package by.academy.homwork.hw1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите сумму покупки: ");
		int cost = sc.nextInt();
		if (cost < 0) {
			System.out.println("Вы ввели отрицательное число");
			sc.close();
			return;
		}
		System.out.print("Введите возрост покупателя: ");
		int age = sc.nextInt();
		if (age < 0) {
			System.out.println("Вы ввели отрицательное число");
			sc.close();
			return;
		}

		if (cost < 100) {
			System.out.println("Сумма скидки 5% и она составляет: " 
								+ ((1 - 0.05) * cost));
		} else if (cost >= 100 & cost < 200) {
			System.out.println("Сумма скидки 7% и она составляет: " 
								+ ((1 - 0.07) * cost));
		} else if (cost >= 200 & cost < 300) {
			if (age > 18) {
				System.out.println("Сумма скидки 16% и она составляет: " 
								+ ((1 - 0.16) * cost));
			} else {
				System.out.println("Сумма скидки 9% и она составляет: " 
								+ ((1 - 0.09) * cost));
			}
		} else if (cost >= 300 & cost < 400){
			System.out.println("Сумма скидки 15% и она составляет: " 
								+ ((1 - 0.15) * cost));
		} else {
			System.out.println("Сумма скидки 20% и она составляет: " 
								+ ((1 - 0.2) * cost));
		}
		sc.close();
	}
}
