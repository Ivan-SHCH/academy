package by.academy.homwork.hw2;

import java.io.IOException;
import java.util.Scanner;

public class StringHw0 {

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int n = 1; n < arr.length; n++) {
				if((Math.abs(arr[i] - arr[n]) == k)){
					pairsCount++;
				}
			}
		}
		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String[] nk = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] arr = new int[n];
		String[] arrItems = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
			System.out.println(arr[i]);
		}

		int result = pairs(k, arr);
		System.out.println(result);
		scanner.close();
	}
}
