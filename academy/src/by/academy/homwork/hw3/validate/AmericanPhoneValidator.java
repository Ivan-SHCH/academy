package by.academy.homwork.hw3.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private final Pattern patern = Pattern
			.compile("^\\+[1][.-]?\\(?([2-9][0-8][0-9])\\)?[-.●]?[2-9][0-9]{2}[-.●]?[0-9]{4}$");

	@Override
	public boolean validate(String str) {
		Matcher matcher = patern.matcher(str);
		return matcher.find();
	}

}