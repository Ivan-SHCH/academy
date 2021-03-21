package by.academy.homwork.hw7.task2;

public class User extends Person {
	private String login;
	private String password;
	public String email;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
	}

	public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password,
			String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;

	}

	private void printUserInfo() {
		System.out.println("Имя - " + getFirstName());
		System.out.println("Фамилия - " + getLastName());
		System.out.println("Возрост - " + getAge());
		System.out.println("День рождения - " + getDateOfBirth());
		System.out.println("Логин - " + getLogin());
		System.out.println("Email - " + getEmail());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" User [name=");
		builder.append(getFirstName());
		builder.append(", LastName=");
		builder.append(getLastName());
		builder.append(", age=");
		builder.append(getAge());
		builder.append(", dateOfBirth=");
		builder.append(getDateOfBirth());
		builder.append(", login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
}
