package by.academy.homwork.hw3;

public class Meat extends Product {
	public Meat(String title, double price, int quantity) {
		super(title, price, quantity);
	}

	public double discont() {
		if (quantity > 10) {
			return 0.8;
		}
		return 1;
	}

	public double fullPrice() {
		return super.fullPrice();
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Товар - Meat.");
		builder.append("Тип мяса: ");
		builder.append(getTitle());
		builder.append(", цена: ");
		builder.append(getPrice());
		builder.append(", количество: ");
		builder.append(getQuantity());
		return builder.toString();
	}
}
