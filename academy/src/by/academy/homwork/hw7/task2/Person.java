package by.academy.homwork.hw7.task2;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String dateOfBirth;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Person() {
		super();
	}

	public Person(String firstName,String lastName,int age,String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}
}
