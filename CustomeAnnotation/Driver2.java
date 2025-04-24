package CustomeAnnotation;

import java.lang.reflect.Method;

public class Driver2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<Task> c = Task.class;
		Method m = c.getMethod("userTask");
		Method m2 = c.getMethod("adminTask");
		
		if(m.isAnnotationPresent(Role.class)) {
			Role role = m.getAnnotation(Role.class);
			System.out.println(role);
			System.out.println(role.value());
		}
		
		if(m2.isAnnotationPresent(Role.class)) {
			Role role = m2.getAnnotation(Role.class);
			System.out.println(role);
			System.out.println(role.value());
		}
	}

}
