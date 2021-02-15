package by.academy.homwork.hw3;

public abstract class Product {
	protected String title;
	protected double price;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(String title, double price, int quantity) {
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double fullPrice() {
		return getPrice() * getQuantity() * discont();
	}

	public abstract double discont();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Наименование - ");
		builder.append(getTitle());
		builder.append(", цена: ");
		builder.append(getPrice());
		builder.append(", количество: ");
		builder.append(getQuantity());
		return builder.toString();
	}

}
