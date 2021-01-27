package by.academy.task.array;

public class TaskArray1 {
//	Задача 1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
//	отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). 
//	Перед созданием массива подумайте, какого он будет размера.
//	2 4 6 … 18 20
//	2
//	4
//	6
//	…
//	20
	public static void main(String[] args) {
		int[] arr1 = new int[10];

		for (int i = 0, n = 2; i < arr1.length; i++, n += 2) {
			arr1[i] = n;
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();

		for (int i : arr1) {
			System.out.println(i);
		}
	}
}
