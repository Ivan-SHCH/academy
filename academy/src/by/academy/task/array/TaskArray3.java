package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray3 {
//	Задача 3.
//	Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
//	Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
//	и выведете это количество на экран на отдельной строке.

	public static void main(String[] args) {
		int[] array = new int[15];
		int count = 0;
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(9);
			if (array[i] % 2 == 0 & array[i] != 0) {
				count++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Четных элементов в массиве: " + count);
	}

}
