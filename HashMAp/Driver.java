package HashMAp;

public class Driver {
	public static void main(String[] args) {
		hashMap h = new hashMap();
		h.put(19, "teacher");
		h.put(24, "LECTUREUR");
		h.put(30, "staff");

		h.display();
		System.out.println(h.getValue(19));
		System.out.println(h.getValue(10));
		System.out.println(h.ContainsKey(30));
		System.out.println(h.ContainsKey(9));
		
	}
}
