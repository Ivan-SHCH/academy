package by.academy.homwork.hw1;

public class Task4 {

	public static void main(String[] args) {
		int numb = 2;
		int power = 1;
		int result = 1;
		
		while (true) {
			if (result > 1_000_000) {
				System.out.println("Результат степень 2 превысил  1_000_000");
				break;
			}
			
			result = result * numb;
			System.out.println("2 в степени " + power + " равно " + result);
			power++;
		}
	}
}
