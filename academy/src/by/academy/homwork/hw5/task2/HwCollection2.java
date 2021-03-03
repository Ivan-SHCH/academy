package by.academy.homwork.hw5.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class HwCollection2 {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		for (int i = 0; i < 1_000_000; i++) {
			list.add(random.nextInt());
			list2.add(random.nextInt());
		}
		
		long beginTimeList = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			list.get(random.nextInt(100_000));
		}
		
		long endTimeList = System.currentTimeMillis();
		System.out.println(endTimeList - beginTimeList);
		
		long beginTimeList2 = System.currentTimeMillis();
		for(int i = 0; i < 100_000; i++) {
			list2.get(random.nextInt(100_000));
		}
		
		long endTimeList2 = System.currentTimeMillis();
		System.out.println(endTimeList2 - beginTimeList2);
	}

}
