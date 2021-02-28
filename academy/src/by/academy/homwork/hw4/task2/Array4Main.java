package by.academy.homwork.hw4.task2;

import java.util.Scanner;

public class Array4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Generic<Integer> arrInt = new Generic<>(2);		/* массив с заданым размером */

		arrInt.set(0, 1); 								/* вставка по одному элементузаданым размером массива */
		arrInt.set(1, 2);
		System.out.println("arrInt1 - " + arrInt);
		System.out.println("Размер первого массива " + arrInt.getLength()); /* размер массива */

		Generic<Integer> arrInt2 = new Generic<>();
		System.out.println("Размер массива по дефолту " + arrInt2.getLength());

//		System.out.println("Ручной ввод массива с его расширение");
//		Generic<Integer> arrInt3 = new Generic<>(5);
//		for (int i = 0; i < 7; i++) {
//			arrInt3.addArray(sc.nextInt());
//		}
//		System.out.println("arrInt3 - " + arrInt3);
//		System.out.println("Размер arrInt3 -  " + arrInt3.getLength());
//		arrInt3.getFirst();										/* Вывод первого элемента массива */
//		arrInt3.getLastElement();								/* Вывод первого элемента массива */
//		System.out.println("Удален элемент под индексом 3  - " + arrInt3.get(3));
//		arrInt3.remove(3); 										/* Удаление по индексу */
//		System.out.println(arrInt3);
//		System.out.print("Введите значение которое хотите удалить ");
//		arrInt3.removeValue(sc.nextInt());
//		System.out.println("arrInt3 - " + arrInt3);
//		
		
//		Generic<String> arrStr = new Generic<>(3);
//		arrStr.set(0, "мама");
//		arrStr.set(1, "мыла");
//		arrStr.set(2, "раму");
//		System.out.println(arrStr);
//		arrStr.remove(2);
//		System.out.println(arrStr);
//		arrStr.removeValue("мама");
//		System.out.println(arrStr);

		sc.close();

	}

}
