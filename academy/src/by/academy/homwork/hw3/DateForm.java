package by.academy.homwork.hw3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateForm {
	Matcher matcher = null;
	private Pattern patern1 = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
	private Pattern patern2 = Pattern.compile("([0-9]{2})-([0-9]{2})-([0-9]{4})");
	LocalDate date = null;
	DateTimeFormatter formatter = null;

	public Matcher getMatcher() {
		return matcher;
	}

	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public DateTimeFormatter getFormatter() {
		return formatter;
	}

	public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}

	public void deadline() {
		date = LocalDate.now().plusDays(10);
		System.out.println(
				"Deadline - День: " + date.getDayOfMonth() + " Месяц: " + date.getMonth() + " Год: " + date.getYear());
	}

	public boolean getDateForm1(String str) {
		matcher = patern1.matcher(str);
		if (matcher.find()) {
			return true;
		}
		return false;
	}

	public boolean getDateForm2(String str) {
		matcher = patern2.matcher(str);
		if (matcher.find()) {
			return true;
		}
		return false;
	}

	public LocalDate date(String str) {
		getDateForm1(str);
		if (getDateForm1(str)) {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.US);
			date = LocalDate.parse(str, format);
			return date;
		}
		getDateForm2(str);
		if (getDateForm2(str)) {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy").withLocale(Locale.US);
			date = LocalDate.parse(str, format);
			return date;
		}
		return null;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("День: " + date.getDayOfMonth());
		builder.append(" Месяц: " + date.getMonth());
		builder.append(" Год: " + date.getYear());
		return builder.toString();
	}

}