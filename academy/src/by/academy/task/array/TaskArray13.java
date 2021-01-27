package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Задача 13                                                                                                      
//Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. 
//Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод. 
//Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только
//из чётных элементов первого массива, 
//если они там есть, и вывести его на экран.
public class TaskArray13 {

	public static void main(String[] args) {
		int length;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		do {
			System.out.print("Введите натуральное число больше 3: ");
			length = sc.nextInt();
		} while (length <= 3);
		System.out.println(length);
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(length);
			if (arr[i] != 0 & arr[i] % 2 == 0) {
				count++;
			}
		}

		int[] arraven = new int[count];
		int ind = 0;
		System.out.println(arraven.length);
		for (int i : arr) {
			if (arr[i] != 0 & i % 2 == 0) {
				arraven[ind] = i;
				ind++;
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("Четные элементы  первого массива: " + count);
		System.out.println(Arrays.toString(arraven));
		sc.close();
	}
}
