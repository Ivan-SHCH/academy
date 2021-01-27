package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray15 {
//	Задача 15.
//	Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. 
//	Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого 
//	массива (его индекс не имеет значения).  
	public static void main(String[] args) {
		int[][] arr = new int[5][8];
		Random rand = new Random();
		int maxarr = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int n = 0; n < arr[i].length; n++) {
				arr[i][n] = rand.nextInt(199) - 99;
				if (maxarr < arr[i][n]) {
					maxarr = arr[i][n];
				}
			}

		}

		System.out.println(Arrays.deepToString(arr));
		System.out.println("Максимальное значение в двухмерном массиве: " + maxarr);
	}

}
