package by.academy.homwork.hw3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import by.academy.homwork.hw3.validate.AmericanPhoneValidator;
import by.academy.homwork.hw3.validate.BelarusPhoneValidator;
import by.academy.homwork.hw3.validate.EmailValidator;

public class InputOutput {
	public final String INPUT_FILE = "src//bild.txt";
	private Deal deals;
	private Product[] prod;
	private final int minProdArray = 1;
	private final Scanner sc = new Scanner(System.in);
	private int countProduct = 0;
	public final String menu = "1. Введите данные для сделки." + "\n2. Положить продукты в корзину. "
			+ "\n3. Удалить продукты из корзины. " + "\n4. Вывести список товаров в корзине."
			+ "\n5. Расчитать сделку. " + "\n6. Валидация телефона и email." + "\n7. Выход"
			+ "\n--------------------------------------------";
	public final String prodMenu = "1.Wine." + "\n2.Cheese." + "\n3.Meat." + "\n4.Выход";

	public Product[] getProd() {
		return prod;
	}

	public void setProd(Product[] prod) {
		this.prod = prod;
	}

	/**
	 * Основной метод, который при вызове его все запускает.
	 */
	public void inputQuantityDeal() throws Exception {
		System.out.println("Меню для оформления сделки.");
		System.out.println(menu);
		String str = input("Сделайте свой выбор");
		while (!str.equals("7")) {
			switch (str) {
			case "1":
				inputDeal();
				System.out.println("Press any key to continue...");
				System.in.read();
				break;

			case "2":
				inputProduct();
				break;

			case "3":

				delProduct();
				System.out.println("Press any key to continue...");
				System.in.read();
				break;

			case "4":
				printProduc();
				System.out.println("Press any key to continue...");
				System.in.read();
				break;

			case "5":
				output();
				System.out.println("Press any key to continue...");
				System.in.read();
				break;

			case "6":
				validete();
				System.out.println("Press any key to continue...");
				System.in.read();
				break;

			default:
				System.out.println("Вы вели не правильное значение!");
				break;

			}
			System.out.println(menu);
			str = sc.nextLine().trim();
		}
		sc.close();
	}

	/**
	 * Проверка на валидацию телефонов и email.
	 */
	public void validete() {
		if (deals == null) {
			System.out.println("Сначала Введите данные для сделки!!!");
			return;
		}

		System.out.println("Валидация белорусского номера телефона " + deals.getSeller().getName()
				+ " . Номер телефона: " + deals.getSeller().getPhone());
		System.out.println(new BelarusPhoneValidator().validate(deals.getSeller().getPhone()));
		System.out.println("Валидация американского номера телефона " + deals.getSeller().getName()
				+ " . Номер телефона: " + deals.getSeller().getPhone());
		System.out.println(new AmericanPhoneValidator().validate(deals.getSeller().getPhone()));
		System.out.println("Валидация белорусского номера телефона " + deals.getBuyer().getName()
				+ " . Номер телефона: " + deals.getBuyer().getPhone());
		System.out.println(new BelarusPhoneValidator().validate(deals.getBuyer().getPhone()));
		System.out.println("Валидация американского номера телефона " + deals.getBuyer().getName()
				+ " . Номер телефона: " + deals.getBuyer().getPhone());
		System.out.println(new AmericanPhoneValidator().validate(deals.getBuyer().getPhone()));
		System.out.println(
				"Валидация e-mail " + deals.getBuyer().getName() + " . E-mail: " + deals.getBuyer().getEmail());
		System.out.println(new EmailValidator().validate(deals.getBuyer().getEmail()));
		System.out.println(
				"Валидация e-mail " + deals.getSeller().getName() + " . E-mail: " + deals.getSeller().getEmail());
		System.out.println(new EmailValidator().validate(deals.getSeller().getEmail()));
		System.out.println("--------------------------------------------");
	}

	/**
	 * Метод создания сделки.
	 */
	public void inputDeal() throws Exception {
		if (deals == null) {
			System.out.print("Данные для сделки: ");
			System.out.println("Введите дату сделки в одном из форматов ");
			DateForm date = inputDate();
			System.out.println("Продавец");
			Person seller = inputPerson();
			System.out.println("___________________");
			System.out.println("Покупатель");
			Person buyer = inputPerson();
			deals = new Deal(date, seller, buyer);

			System.out.println("Данные введены.");
		} else {
			System.out.println("Данные о сделке уже введены!");
		}

	}

	/**
	 * Метод создания массива продуктов.
	 */
	public void addProduct(Product product) {
		if (prod == null) {

			prod = new Product[minProdArray];
		} else {
			if ((countProduct + 1) > prod.length) {
				expProduct();
			}
		}
		prod[countProduct++] = product;
	}

	/**
	 * Метод расширения массива под продукты. Созавая новый массив и копирую туда
	 * старый.
	 */
	public void expProduct() {
		Product[] tempProduct = new Product[prod.length * 2 + 1];
		System.arraycopy(prod, 0, tempProduct, 0, prod.length);
		prod = tempProduct;
	}

	/**
	 * Метод удаления продуктов.
	 */
	public void delProduct() {
		int count = 0;
		if (prod == null) {
			System.out.println("Прежде чем что-то удалять. Надо наполнить корзину!");
		} else {

			for (int i = 0; i < countProduct; i++) {
				System.out.println("Название продукта:" + prod[i].getTitle() + ", его стоимость:" + prod[i].getPrice());
			}
			String name = input("Введите продукт который хочете удалить");

			for (int i = 0; i < countProduct; i++) {
				if (prod[i].getTitle().equalsIgnoreCase(name)) {
					count = i;
					break;
				}
			}

			if (countProduct != (count + 1)) {
				System.arraycopy(prod, count + 1, prod, count, prod.length - count - countProduct);
			}
			prod[countProduct] = null;
			countProduct--;
			System.out.println("Товар успешно удален.");
		}
	}

	/**
	 * Метод установки и проверки даты сделки, на определенный паттерн.
	 */
	public DateForm inputDate() throws ParseException {
		DateForm date = new DateForm();
		String date1 = null;
		do {
			date1 = input("dd/mm/yyyy или dd-mm-yyyy");
			date.getDateForm1(date1);
			date.getDateForm2(date1);
			if (!date.getDateForm1(date1) && !date.getDateForm2(date1)) {
				System.out.println("Пожалуйсто введите дату в нужном формате");
			}
		} while (!date.getDateForm1(date1) && !date.getDateForm2(date1));
		date.date(date1);
		return date;
	}

	/**
	 * Метод добавления продуктов.
	 */
	public void inputProduct() {
		System.out.println(prodMenu);
		String str = input("Сделайте свой выбор");
		while (!str.equals("4")) {
			switch (str) {
			case "1":
				String title = input("Название вина");
				String price = input("Цена");
				String quantity = input("Количество");
				String country = input("Страна");
				addProduct(new Wine(title, Double.valueOf(price), Integer.valueOf(quantity), country));
				System.out.println("\n--------------------------------------------");
				System.out.println("Товар добавлен.");
				System.out.println("\n--------------------------------------------");
				break;

			case "2":
				String ctitle = input("Название сыра");
				String cprice = input("Цена");
				String cage = input("Выдержка");
				String cquantity = input("Количество");
				addProduct(
						new Cheese(ctitle, Double.valueOf(cprice), Integer.valueOf(cquantity), Integer.valueOf(cage)));
				System.out.println("--------------------------------------------");
				System.out.println("Товар добавлен.");
				System.out.println("--------------------------------------------");
				break;

			case "3":
				String mtitle = input("Вид мяса");
				String mprice = input("Цена");
				String mquantity = input("Количество");
				addProduct(new Meat(mtitle, Double.valueOf(mprice), Integer.valueOf(mquantity)));
				System.out.println("\n--------------------------------------------");
				System.out.println("Товар добавлен.");
				System.out.println("\n--------------------------------------------");
				break;

			default:
				System.out.println("Вы вели не правильное значение!");
				break;
			}
			System.out.println(prodMenu);
			str = input("Сделайте свой выбор");
		}
	}

	/**
	 * Метод установки и проверки даты , на определенный паттерн.
	 */
	public Person inputPerson() throws Exception {
		Person person = new Person();
		String personName = input("Имя");
		String email = input("Введите email");
		String personPhone = input("Телефон");
		String personMoney = input("количество денег на счету");
		person.setDateOfBirth(dateOfBirth());
		person.setEmail(email);
		person.setName(personName);
		person.setPhone(personPhone);
		person.setMoney(Double.valueOf(personMoney));
		return person;
	}

	/**
	 * Метод установки и проверки даты рождения, на определенный паттерн.
	 */
	public String dateOfBirth() throws Exception {
		DateForm dateOfBirth = new DateForm();
		String date1 = null;
		do {
			System.out.println("Дата рождения: ");
			date1 = input("dd/mm/yyyy или dd-mm-yyyy");
			dateOfBirth.getDateForm1(date1);
			dateOfBirth.getDateForm2(date1);
			if (!dateOfBirth.getDateForm1(date1) && !dateOfBirth.getDateForm2(date1)) {
				System.out.println("Пожалуйсто введите дату в нужном формате");
			}
		} while (!dateOfBirth.getDateForm1(date1) && !dateOfBirth.getDateForm2(date1));

		return date1;
	}

	/**
	 * Этот метод использовался для ввода данных с клавиатуры.
	 */
	public String input(String message) {
		System.out.print(message + " - ");
		String str = sc.nextLine().trim();
		return str;
	}

	/**
	 * Метод для просмотра корзины
	 */
	public void printProduc() {
		int count = 0;
		double check = 0;
		if (prod != null) {

			for (int i = 0; i < this.countProduct; i++) {
				System.out.println(prod[i].toString());
				check += prod[i].getPrice() * prod[i].getQuantity();
				count += prod[i].getQuantity();
			}
		}

		System.out.println("Общее количество товаров - " + count + "\nНа сумму без скидок - " + check);
		if (deals.getBuyer().getMoney() < check) {
			System.out.println("У покупателя недостаточно средств на счету." + " Сумма счета превышает на "
					+ (deals.getBuyer().getMoney() - check) * -1 + " рублей." + "\nПожалуйсто удалите лишний продукт.");
		}
		System.out.println("--------------------------------------------");
	}

	/**
	 * Этот для подсчета суммы с учетом скидки.
	 */
	public double getSumm() {
		double total = 0;
		for (int i = 0; i < countProduct; i++) {
			total += prod[i].fullPrice();
		}
		return total;
	}

	/**
	 * Метод вывода на экран сделки.
	 * 
	 *
	 */
	public void output() {
		if (deals == null) {
			System.out.println("Сначала Введите данные для сделки!!!");
			return;
		} else {
			System.out.println("Дата заключени сделки - " + deals.getDate());
			System.out.println(deals.date.deadline());
			System.out.println("Сделка междуп продавцом " + deals.getSeller().getName() + " и покупателем "
					+ deals.getBuyer().getName());
			for (int i = 0; i < countProduct; i++) {

				System.out.printf("  " + prod[i].getTitle() + " : " + prod[i].getQuantity() + " x " + prod[i].getPrice()
						+ " = " + "%.2f", prod[i].fullPrice());
			}

			if (deals.getBuyer().getMoney() < getSumm()) {
				System.out.println("Недостаточно средств!");
				return;
			}

			System.out.println("\n____________________________________________");
			System.out.printf("Итого на сумму: " + "%.2f", getSumm());
			System.out.println();
			System.out.println("Сумма сделки: " + getSumm());
			deals.getBuyer().setMoney(deals.getBuyer().getMoney() - getSumm());
			deals.getSeller().setMoney(deals.getSeller().getMoney() + getSumm());

			System.out.println("Сумма денежных средств на счету у покупателя " + deals.getBuyer().getName() + ": "
					+ deals.getBuyer().getMoney() + "\n" + "Сумма денежных средств на счету у продовца"
					+ deals.getSeller().getName() + ": " + deals.getSeller().getMoney());
			System.out.println("--------------------------------------------");
		}

		System.out.println("Вы хотите создать файл счета?");
		String bild = input("Y - да / N - нет ");
		if (bild.equalsIgnoreCase("Y")) {
			printBild();
			System.out.println("Файл успешно создан");
		} else {
			return;
		}

	}

	/**
	 * Метод создания Счет-файла
	 *
	 */
	public void printBild() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE))) {
			writer.write("\t\t\tСЧЕТ");
			writer.newLine();
			writer.write("Дата заключени сделки - " + deals.getDate());
			writer.newLine();
			writer.write(deals.date.deadline());
			writer.newLine();
			writer.write("Сделка междуп продавцом " + deals.getSeller().getName() + " и покупателем "
					+ deals.getBuyer().getName());
			writer.newLine();
			for (int i = 0; i < countProduct; i++) {
				writer.write("  " + prod[i].getTitle() + " : " + prod[i].getQuantity() + " x " + prod[i].getPrice()
						+ " = " + prod[i].fullPrice());
				writer.newLine();
			}
			writer.write("\n____________________________________________");
			writer.newLine();
			writer.write("Итого на сумму: " + getSumm());

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
