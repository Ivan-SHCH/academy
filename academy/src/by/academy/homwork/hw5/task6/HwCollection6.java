package by.academy.homwork.hw5.task6;

import java.util.Random;

public class HwCollection6 {

	public static void main(String[] args) {
		int[] array = new int[8];
		try {
			Random rand = new Random();
			for(int i = 0; i < 10; i++) {
				array[i] = rand.nextInt();
			}
		}catch(ArrayIndexOutOfBoundsException e ) {
			e.printStackTrace();
		}
	}

}
