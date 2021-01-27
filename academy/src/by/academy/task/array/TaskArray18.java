package by.academy.task.array;

import java.util.Arrays;
import java.util.Random;

public class TaskArray18 {
//	Задача 18.
//	Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать 
//	каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек,
//	а примеры среди них не должны повторяться.В помощь учителю напишите программу, которая будет выводить 
//	на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению
//			на 1 и на 10 — слишком просты).	При этом среди 15 примеров не должно быть повторяющихся 
//	(примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).

	public static void main(String[] args) {
		int[][] tab = new int[15][3];
		Random rand = new Random();
		for (int i = 0; i < tab.length; i++) {
			for (int n = 0; n < tab[i].length; n++) {
				tab[i][n] = rand.nextInt(8) + 2;
				if (n == tab[i].length - 1) {
					tab[i][n] = tab[i][n - 2] * tab[i][n - 1];
					for (int j = 0; j < i; j++) {
						if (tab[i][n] == tab[j][n] && i > 0) {
							if (tab[i][n - 1] == tab[j][n - 1] 
									|| tab[i][n - 2] == tab[j][n - 2]) {
								--i;
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Задание №" + (i + 1 + " : "));
			for (int h = 0; h < tab[i].length; h++) {
				if (h == 0) {
					System.out.print(tab[i][h] + " x ");
				}
				if (h == 1) {
					System.out.println(tab[i][h]);
				}
			}
		}
		System.out.println(Arrays.deepToString(tab));
	}
}