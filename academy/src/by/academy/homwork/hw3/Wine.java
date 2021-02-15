package by.academy.homwork.hw3;

public class Wine extends Product {

	private String country;

	public Wine(String title, double price, int quantity, String country) {
		super(title, price, quantity);
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double fullPrice() {
		return super.fullPrice();
	}

	@Override
	public double discont() {
		if (country.equalsIgnoreCase("Italy")) {
			return 0.93;
		}
		return 1.0;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Товар - Wine.");
		builder.append("Название: ");
		builder.append(getTitle());
		builder.append(", цена: ");
		builder.append(getPrice());
		builder.append(", количество: ");
		builder.append(getQuantity());
		builder.append(", страна производитель: ");
		builder.append(getCountry());
		return builder.toString();
	}
}
