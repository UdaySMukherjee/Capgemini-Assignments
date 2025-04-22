package LamdaFunction;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","guava","anar");
		String res = list.stream().filter(i -> i.charAt(0)=='a').findFirst().get();
		System.out.println(res);
	}
}
