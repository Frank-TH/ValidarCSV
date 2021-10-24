package newcore.templarios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	String date = "\\d{4}-\\d{2}-\\d{2}";
	String IDemployee = "\\w{11}";
	String company = "\\d{3}";
	String code = "PER_";
	String amount = "\\d{0,16}\\.\\d{2}";

	public boolean employee_id(String input) {
		Pattern p = Pattern.compile(IDemployee);
		Matcher m = p.matcher(input);

		return m.matches();
	}

	public boolean fecha(String input) {

		Pattern p = Pattern.compile(date);
		Matcher m = p.matcher(input);

		return m.matches();

	}

	public boolean amount(String input) {

		Pattern p = Pattern.compile(amount);
		Matcher m = p.matcher(input);

		return m.matches();

	}
	
	public boolean company(String input) {

		Pattern p = Pattern.compile(company);
		Matcher m = p.matcher(input);

		return m.matches();

	}
	
	public boolean code(String input) {

		Pattern p = Pattern.compile(code);
		Matcher m = p.matcher(input);

		return m.matches();

	}

}
