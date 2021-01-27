package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

//Задача 4.

//Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. 
//Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

public class TaskArray4 {
	public static void main(String[] args) {
		int[] arr = new int[8];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
			if (arr[i] % 2 != 0) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
