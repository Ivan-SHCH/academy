package by.academy.homwork.hw4.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

import by.academy.homwork.hw4.task1.validate.ValidateDate;

public class LocalD {

	private LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate date(String str) {
		if (new ValidateDate().validate(str)) {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy").withLocale(Locale.US);
			date = LocalDate.parse(str, format);
			return date;
		} else {
			System.out.println("Что-то пошло не так!");
		}
		return null;

	}

	public void SumLocalDate(LocalDate date1, LocalDate date2) {
		System.out.println(
				"Количество дней в заданом промежутке состовляет " + ChronoUnit.DAYS.between(date1, date2) + " дней");
	}
}
