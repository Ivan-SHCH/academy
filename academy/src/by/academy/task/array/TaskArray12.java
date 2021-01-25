package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray12 {
//	Задача 12.
//	Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] 
//	таким образом, чтобы отрицательных и положительных элементов там было поровну и не было нулей. 
//	При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, 
//	когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел 
//	или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.     

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[12];
		int pos = 0;
		int neg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(21) - 10;
			if (arr[i] > 0) {
				pos++;
			} else {
				neg++;
			}

			if (arr[i] == 0 || pos > neg + 1 || neg > pos + 1) {
				--i;
				if (pos > neg + 1) {
					pos--;
				}

				if (neg > pos + 1) {
					neg--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(pos + " " + neg);
	}
}
