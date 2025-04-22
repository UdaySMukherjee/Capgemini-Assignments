package RegexImplementation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
	public static void main(String[] args) {
		
		String regex = "\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}";
		String text = "Call me at 111 222 3333 or 333-444-5555 or 999.899.9999";
		
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(text);
		
		while(matcher.find()) {
			String s = matcher.group();
			System.out.println(s);
			
		}
	}

}
