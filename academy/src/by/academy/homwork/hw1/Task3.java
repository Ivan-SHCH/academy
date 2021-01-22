package by.academy.homwork.hw1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число от 1 до 10: ");
		int numb = sc.nextInt();
		int result;
		
		if(numb <= 0 || numb > 10) {
			System.out.println("Вы ввели число вне диапазона значения.");
			return;
		}

		for(int i = 1; i < 10; i++) {
			result = numb * i;
			System.out.println(numb+ " x " + i + " = " + result  );
		}
	}
}
