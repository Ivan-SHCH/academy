package by.academy.task.array;

import java.util.Random;

public class TaskArray16 {
//	Задача 16.                                                                                       
//	Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. 
//	Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением
//	элементов. 	Если таких строк несколько, то вывести индекс первой встретившейся из них.  

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		int res = 1;
		int[][] arr = new int[7][4];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Строка " + i + " : ");
			for (int n = 0; n < arr[i].length; n++) {
				arr[i][n] = rand.nextInt(11) - 5;
				System.out.print(arr[i][n] + " ");
				res *= Math.abs(arr[i][n]);
				if (res > max) {
					max = res;
					index = i;
				}
			}
			System.out.println();
			res = 1;
		}
		System.out.println("В строке " + index + " наибольшее " 
							+ "произведение всего массива равное: " + max);
	}
}
