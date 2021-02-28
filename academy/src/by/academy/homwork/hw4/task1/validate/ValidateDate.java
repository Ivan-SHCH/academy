package by.academy.homwork.hw4.task1.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDate implements Validator {
	private Pattern pattern = Pattern.compile("([0-9]{2})-([0-9]{2})-([0-9]{4})");

	public boolean validate(String str) {
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
