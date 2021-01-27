package by.academy.task.array;

import java.util.Arrays;

public class TaskArray7 {
//	Задача 7.
//	Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. 
//	Напоминаем, что первый и второй члены последовательности равны единицам,
//	а каждый следующий — сумме двух предыдущих.
	public static void main(String[] args) {
		int[] fibonachi  = new int[20];
		int n0 = 1;
		int n1 = 1;
		int res;
		fibonachi[0] = 1;
		fibonachi[1] = 1;
		for(int i = 2; i < fibonachi.length; i++) {
			res = n0 +n1;
			fibonachi[i] = res;
			n0 = n1;
			n1 = res;
		}
		System.out.println(Arrays.toString(fibonachi));
	}
}
