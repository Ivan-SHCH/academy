package by.academy.homwork.hw5.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HwCollection4 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			list.add(rand.nextInt(10) + 1);
		}

		int max = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}

		Iterator<Integer> iterator = list.iterator();
		System.out.println(list.toString());

		while (iterator.hasNext()) {
			if (max == iterator.next()) {
				System.out.print(max + " ");

			}
		}
	}
}
