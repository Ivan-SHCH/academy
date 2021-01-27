package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray8 {
//	Задача 8.
//	Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. 
//	Определите какой элемент является в этом массиве максимальным и 
//	сообщите индекс его последнего вхождения в массив.
	public static void main(String[] args) {
		int[] array = new int[12];
		Random rand = new Random();
		int max = Integer.MIN_VALUE;
		int flag = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(31) - 15;
		}

		for (int i = 0; i < array.length; i++) {
			if (max <= array[i]) {
				max = array[i];
				flag = i;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Максимальны элемент в массиве " + max + ", а его индекс " + flag + ".");
	}

}
