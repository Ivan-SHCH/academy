package by.academy.task.array;

//Задача 2.

//Создайте массив из всех нечётных чисел от 1 до 99, 
//выведите его на экран в строку, а затем этот же массив 
//выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

public class TaskArray2 {
	public static void main(String[] args) {
		int[] arr1 = new int[50];
		for (int i = 0, n = 1; i < arr1.length; i++, n += 2) {
			arr1[i] = n;
		}
		
		for (int i = 49; i >= 0; i--) {
			System.out.print(arr1[i] + " ");
		}
	}
}
