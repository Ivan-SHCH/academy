package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray10 {
//	Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 
//	Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
//	Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
	public static void main(String[] args) {
		int[] arr = new int[11];
		Random rand = new Random();
		int count1 = 0; 						// счетчик для 1
		int count2 = 0; 						// счетчик для -1
		int zero = 0; 							// счетчик для 0
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(3) - 1;
			if (arr[i] == 1) {
				count1++;
			} else if (arr[i] == -1) {
				count2++;
			} else {
				zero++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Количество 1: " + count1 + ";" 
							+ " Количество -1: " + count2 + ";" 
							+ " Количество  0: " + zero);
		
		if (count1 > count2 & count1 > zero) {
			System.out.println("Элементов с значением 1 больше всего в массиве" );
		} else if (count2 > count1 & count2 > zero ) {
			System.out.println("Элементов с значением -1 больше всего в массиве" );
		}else {
			System.out.println("Элементов с значением 0 больше всего в массиве" );
		}
			
	}

}
