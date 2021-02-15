package by.academy.homwork.hw3;

public class Cheese extends Product {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cheese(String title, double price, int quantity, int age) {
		super(title, price, quantity);
		this.age = age;
	}

	public double fullPrice() {
		return super.fullPrice();
	}

	@Override
	public double discont() {
		if (age > 10) {
			return 0.9;
		}
		return 1.0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Товар - Cheese.");
		builder.append("Название: ");
		builder.append(getTitle());
		builder.append(", цена: ");
		builder.append(getPrice());
		builder.append(", количество: ");
		builder.append(getQuantity());
		builder.append(", выдержка сыра: ");
		builder.append(getAge());
		return builder.toString();
	}
}
