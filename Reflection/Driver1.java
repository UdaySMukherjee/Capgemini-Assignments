package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Driver1 {

	public static String toString(Object[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append("\n");
        }
    }
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		/*
		
		Class<Person> c = Person.class; // class object
		
		Class<Person> c2 = (Class<Person>) new Person("Dinga", 30).getClass();
		
		Class<Person> c3 = (Class<Person>) Class.forName("Reflection.Person");
		
		*/
		
		Class<Person> c = Person.class;
		
		/*
		Package p = c.getPackage();
		System.out.println(p);
		*/
		
		/*
		 c.getConstructor() -> returns only public no argument constructor
		 c.getConstructors() -> returns array of only public constructors
		 c.getDeclaredConstructor() -> returns array of all type of declared constructor (public, private, default) in the class 
		 
		 c.getMethods() -> returns array of all public methods of same and super class
		 c.getDeclaredMethods() -> returns array of all level methods of same class
		 
		 Class<Object> c2 = (Class<Object>) c.getSuperclass() -> returns Object instance super class
		 Method[] super_class_methods = c2.getDeclaredMethods(); -> returns array of public methods of super class
		 
		 Method m1 = c.getMethod("Method_Name", datatype.class or argument_type.class) -> returns specific public method
		 Method m1 = c.getDeclaredMethod("Method_Name", wrapper.class or argument_type.class) -> returns specific all level method
		 m1.invoke(null or Object, actual arguments) -> calls the specific method. Null for static method and specific class object for non-static method
		  
		 Field[] all_var = c.getDeclaredFields(); -> returns array of all level all global variables of same class
		 Field f = c.getDeclaredField("Variable_name"); -> returns specific all level global variable of same class
		 
		 */
		
//		Constructor<?>[] cons = c.getDeclaredConstructors();
//		System.out.println(Arrays.toString(cons));
		
		Constructor<Person> cons = c.getDeclaredConstructor();
		cons.setAccessible(true);
		Person p = cons.newInstance();
		System.out.println(p);
		
		Method[] all_methods = c.getMethods();
		System.out.println(Driver1.toString(all_methods));
		
		System.out.println();
		
		Method[] same_class_methods = c.getDeclaredMethods();
		System.out.println(Driver1.toString(same_class_methods));
		
		Method m1 = c.getDeclaredMethod("getDetails", int.class);
		String s = (String) m1.invoke(new Person("Dinga", 20), 10);
		System.out.println(s);
	}

}
