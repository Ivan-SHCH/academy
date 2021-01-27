package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskArray11 {
//	Задача 11.
//	Пользователь должен указать с клавиатуры чётное положительное число, 
//	а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] 
//	и вывести его на экран в строку. 
//	После этого программа должна определить и сообщить пользователю о том,
//	сумма модулей какой половины массива больше: 
//	левой или правой, либо сообщить, что эти суммы модулей равны. 
//	Если пользователь введёт неподходящее число, то программа должна требовать 
//	повторного ввода до тех пор, пока не будет указано корректное значение.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int lenght;
		int leftarr = 0 ;
		int rightarr = 0;
		do {
			System.out.print("Введите четное положительное число: ");
			lenght = sc.nextInt();
			if (lenght <= 0 | lenght % 2 != 0) {
				System.out.println("Вы ввели не допустимое число. " 
						+ "Пожалуйсто введите четное положительное число!");
				}

		} while (lenght <= 0 | lenght % 2 != 0);
		
		int[] arr = new int[lenght];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(11)-5;
		}
		
		System.out.println(Arrays.toString(arr));

		for(int i = 0; i < arr.length; i++){
			if(i <= arr.length/2-1) {
				leftarr += Math.abs(arr[i]);
			} else {
				rightarr += Math.abs(arr[i]);
			} 
		}
		
		System.out.println("Сумма левой части массива: " + leftarr);
		System.out.println();
		if(leftarr > rightarr) {
			System.out.println("Сумма модулей левой части массива больше правой.");
		} else if(rightarr > leftarr) {
			System.out.println("Сумма модулей правой части массива больше правой.");
		} else {
			System.out.println("Суммы модулей левой и правой части масивов равны.");
		}
		sc.close();
	}
}
