package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray5 {
//	Задача 5.
//	Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, 
//	выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, 
//	для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int result1 = 0;
		int result2 = 0;
		double midle1;
		double midle2;
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			arr1[i] = rand.nextInt(5);
			arr2[i] = rand.nextInt(5);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		for (int i = 0; i < 5; i++) {
			result1 += arr1[i];
			result2 += arr2[i];
		}
		
		System.out.println("Сумма первого массива: " + result1);
		System.out.println("Сумма второго массива: " + result2);
		System.out.println("Среднеарифметическое число первого массива: " 
							+ (midle1 =(double) result1 / 5));
		System.out.println("Среднеарифметическое число второго массива: " 
							+ (midle2 =(double) result2 / 5));
		
		if(midle1 > midle2) {
			System.out.println("Среднеарифметическое число"
					+ " первого массива больше чем у второго.");
		} else if (midle1 == midle2) {
			System.out.println("Среднеарифметические числа равны!");
		} else {
			System.out.println("Среднеарифметическое число"
					+ " второго массива больше чем у первого.");
		}
	}
}
