package by.academy.homwork.hw4.task3;

import java.util.Arrays;
import java.util.Random;

public class MainIterator {
	public static void main(String[] args) {
		Random random = new Random();
		Integer[][] array = new Integer[5][5];
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				array[i][k] = random.nextInt(10) + 1;
			}
		}
		System.out.println(Arrays.deepToString(array));
		IteratorArray<Integer> iterator = new IteratorArray<>(array);
		System.out.println("Работа итератора.");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
