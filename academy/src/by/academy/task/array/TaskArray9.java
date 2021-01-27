package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray9 {

//	Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных 
//	чисел. Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента 
//	из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом. 
//	Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество 
//	целых элементов в третьем массиве.

	public static void main(String[] args) {
		int[] arrint1 = new int[10];
		int[] arrint2 = new int[10];
		double[] arrdoub = new double[10];
		int count = 0;

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			arrint1[i] = rand.nextInt(9) + 1;
			arrint2[i] = rand.nextInt(9) + 1;
			arrdoub[i] = (double) arrint1[i] / arrint2[i];
		}
		System.out.println(Arrays.toString(arrint1));
		System.out.println(Arrays.toString(arrint2));
		System.out.println(Arrays.toString(arrdoub));

		for (double i : arrdoub) {
			if (i % 1 == 0) {
				count++;
			}
		}

		System.out.println("Количество целых элементов в третьем массиве: " + count);
	}
}
