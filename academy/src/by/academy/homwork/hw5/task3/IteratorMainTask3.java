package by.academy.homwork.hw5.task3;

import java.util.Arrays;
import java.util.Random;

public class IteratorMainTask3 {
	/**
	 *по приколу, чтобы не повторять задание из предыдущего дз.
	 *Хотя одно и тоже.
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		Integer[][][] arr = new Integer[3][3][3];
		for(int i = 0; i < arr.length; i++) {
			for(int n = 0; n <arr[i].length; n++) {
				for(int k = 0; k < arr[n].length; k++) {
					arr[i][n][k] = rand.nextInt(10);
				} 
			}
		}
		System.out.println(Arrays.deepToString(arr));
		IteratorAr<Integer> iterator = new IteratorAr<>(arr);
		System.out.println("Работа итератора.");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
	}
}
