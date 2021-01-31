package by.academy.homwork.hw2;

import java.util.Random;
import java.util.Scanner;

public class StringHw4 {

	private static int PAIRS = 5;
	private static String[] deskCard = new String[52];

	public static void main(String[] args) {
		int players = 0;
		String[] cardSuit = { "Черви", "Пик", "Треф", "Бубен" };

		String[] cardRank = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
							"Валет", "Королева", "Король", "Туз" };

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Введите количество игроков:");
			players = sc.nextInt();
			if (players == 0) {
				System.out.println("Игроков должно быть как миним 2, а не 0!");
			} else if (players > 10) {
				System.out.println("Вы ввели больше 10 игроков");
			}

		} while (players == 0 || players > 10 || players < 2);
		
		sc.close();
		System.out.println();
		builderDesk(cardRank, cardSuit);
		mixer(deskCard);
		dealCarts(deskCard, players);
	}
	
	/** 
	 * Метод создает колоду игральных карт
	 */
	public static String[] builderDesk(String[] arr1, String[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int n = 0; n < arr2.length; n++) {
				deskCard[arr2.length * i + n] = arr1[i] + " " + arr2[n];
			}
		}
		return deskCard;
	}
	
	/** 
	 * Метод перетасовывает колоду кар.
	 */
	public static String[] mixer(String[] arr) {
		Random rand = new Random();
		for (int i = 0; i < deskCard.length; i++) {
			int ran = rand.nextInt(52);
			String tm = deskCard[ran];
			deskCard[ran] = deskCard[i];
			deskCard[i] = tm;
		}
		return arr;
	}
	
	/** 
	 * Метод раздает карты на n игроков.
	 */
	public static void dealCarts(String arr[], int n) {
		for (int i = 0; i < n * PAIRS; i++) {
			System.out.print(deskCard[i] + "|");
			if (i % n == PAIRS - 1) {
				System.out.print("\n");
			}
		}
	}
}
