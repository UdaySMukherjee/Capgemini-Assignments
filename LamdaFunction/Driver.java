package LamdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		/*
		
		Operation o = new Calci()::add;
		System.out.println(o.operator(10, 20));
		
		List<Integer> list = Arrays.asList(5,4,3,2,1,0);
		//list.sort((a,b)->a-b);
		Collections.sort(list, Integer::compareTo);
		list.forEach(System.out :: print);
		
		*/
		
		// Stream Api
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(Arrays.asList(8,6,47,7,2,6,9,4,2));
		List<Integer> list3 = list2.stream().filter(i -> i%2==0).toList();
		List<Integer> list4 = list2.stream().map(i -> i * 2).toList();
		System.out.print("list2: ");
		System.out.println(Arrays.toString(list2.toArray()));
		System.out.print("list3: ");
		System.out.println(Arrays.toString(list3.toArray()));
		System.out.print("list4: ");
		System.out.println(Arrays.toString(list4.toArray()));
	}
}
