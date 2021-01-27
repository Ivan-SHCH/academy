package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray6 {
//	Задача 6.
//	Создайте массив из 4 случайных целых чисел из отрезка [10;99], 
//	выведите его на экран в строку. Определить и вывести на экран сообщение о том, 
//	является ли массив строго возрастающей последовательностью.

	public static void main(String[] args) {
		int[] arr = new int[4];
		Random rand = new Random();
		boolean up = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(90) + 10;
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1]) {
				up = false;
				break;
			}
		}

		if (up) {
			System.out.println("Массив является строго возрастающий!");
		} else {
			System.out.println("Массив не является строго возрастающий!");
		}
	}
}
