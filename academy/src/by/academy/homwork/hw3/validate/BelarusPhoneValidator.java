package by.academy.homwork.hw3.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	private final Pattern patern = Pattern
			.compile("^\\+375[.-|.\\-]?\\s?\\(?(17|25|29|33|44)\\)"
					+ "?[.-|.\\-]?\\s?[0-9]{3}[.-|.\s|.\\-]?[0-9]{2}[.-|.\s|.\\-]?[0-9]{2}$");

	@Override
	public boolean validate(String str) {
		Matcher matcher = patern.matcher(str);
		return matcher.find();
	}

}
