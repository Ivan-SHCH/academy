package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray14 {
//	Задача 14.
//	Создать двумерный массив из 8 строк по 5 столбцов 
//	в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.   

	public static void main(String[] args) {
		int[][] arr = new int[8][5];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int n = 0; n < arr[i].length; n++) {
				arr[i][n] = rand.nextInt(90) + 10;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {			//вывод на экран с помощью цикла
			for (int n = 0; n < arr[i].length; n++) {
				System.out.print(arr[i][n] + " ");
			}
		}

		System.out.println();
		System.out.println(Arrays.deepToString(arr));
	}
}
