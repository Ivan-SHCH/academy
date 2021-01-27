package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray17 {
//	Задача 17.
//	Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. 
//	Вывести массив на экран.Преобразовать массив таким образом, чтобы на первом месте в каждой строке 
//	стоял её наибольший элемент.При этом изменять состав массива нельзя, а можно только переставлять 
//	элементы в рамках одной строки. Порядок остальных элементов строки не важен 
//	(т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку). 
//	Вывести преобразованный массив на экран. 

	public static void main(String[] args) {
		int[][] arr = new int[6][7];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int n = 0; n < arr[i].length; n++) {
				arr[i][n] = rand.nextInt(10);
			}
		}
		
		System.out.println("Массив до сортировки.");
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Массив после сортировки.");
		for (int i = 0; i < arr.length; i++) {
			for (int n = 0; n < arr[i].length; n++) {
				int temp;
				for(int j = n; j < arr[i].length -1; j++) {
					if(arr[i][n] < arr[i][j]) {
						temp = arr[i][n];
						arr[i][n] = arr[i][j];
						arr[i][j] = temp; 
					}
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
