package by.academy.homwork.hw3;

public class Deal {
	DateForm date;
	private Person seller;
	private Person buyer;

	public Deal(DateForm date, Person seller, Person buyer) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public DateForm getDate() {
		return date;
	}

	public Person getSeller() {
		return seller;
	}

	public Person getBuyer() {
		return buyer;
	}

}
