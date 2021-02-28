package by.academy.homwork.hw4.task1;

public class Menu {
	private String menuMain = "1. Ввести дату." + "\n2. Расчет количества дней в заданом промежутке времени."
			+ "\n3. Проверка года на високосность." + "\n4. Выход";
	private String menuSumDate = "1. Введите превую дату." + "\n2. Введите вторую дату." + "\n3. Результат."
			+ "\n4. Выход.";

	public String getMenuSumDate() {
		return menuSumDate;
	}

	public String getMenuMain() {
		return menuMain;
	}

}
