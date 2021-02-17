package by.academy.homwork.hw3.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	private static final Pattern patern = Pattern.compile("^\\S+@\\S+\\.\\S+$");

	@Override
	public boolean validate(String str) {
		Matcher matcher = patern.matcher(str);
		return matcher.matches();
	}
}
