package Generics;

import java.util.ArrayList;

public class Box1{
	
	// we cannot create a generic array in java but can create a generic reference variable
	//----------------------
	// Collection frameworks:
	
	/* Framework means set of interfaces and classes. That allow us to store the data
	 in different different data structures. 
	 
	 there are 2 hierarchy:
	 Which are collection hierarchy and Map hierarchy.
	 
	 Inside Iterable interface (it is present in java.lang), there are two methods which are iterator() and forEach().
	 iterator() returns iterator type of object where iterator is again an interface.
	 
	 inside iterator interface: (it is present in java.util)
	 we have-> hasNext() , next(), remove()
	 
	 inside collection interface: (it is present in java.util)
	 we have->
	 boolean add(E e)
	 boolean addAll(Collection<? extends E> c)
	 void clear()
	 boolean contains(Object o) -> is passed object present or not.
	 boolean containsAll(Collection<?> c)
	 boolean isEmpty()
	 boolean remove(Object o)
	 boolean removeAll(Collection<?> c)
	 boolean retainAll(Collection<?> c)
	 int size()
	 Object[] toArray()
	 <T> T[] toArray(T[] a)
	 
	 
	inside List<E> interface: (it is present in java.util)
	we have->
	whatever the methods are present in collection interface, all are inherited into List interface
	extra methods are-> (List is index based)
	void add(int index, E element)
	boolean addAll(int index, Collection<?> c)
	E get(int index)
	int indexOf(Object o)
	int lastIndexOf(Object o)
	E remove(int index)
	boolean remove(Object o)
	E set(int index, E element) -> update the existing element
	
	inside ArrayList<E> class: (it is present in java.util)
	we have->
	Three constructors-> 1. ArrayList() -> No arguments (Constructs an empty list with an initial capacity of ten.)
						 2. ArrayList(int initialcapacity)
						 3. ArrayList(Collection<? extends E> c)

       Vector class and Stack class are legacy classes.
       Initial capacity of vector is 10 and it is thread-safe. ArrayList is not thread-safe. vector capacity is increased by 100%.
	
	 
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		System.out.println(a); // toString() method is
		a.add(1, 101); // shifting
		System.out.println(a);
		a.set(1, 23); // update at index
		System.out.println(a);
		//a.clear();
		System.out.println(a);
		System.out.println(a.contains(10));
		// a.remove(1); -> remove element at index 1
		
		/* 
		Integer i = 30;
		a.remove(i); -> remove i element
		
		Object[] obj = a.toArray(); // convert collection to an array of object[]
		Integer[] i = a.toArray(new Integer[10]); // convert collection to an array of T[]
		
		
		
		*/
		
		

	}
}
