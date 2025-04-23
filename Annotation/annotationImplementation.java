package Annotation;

import java.util.ArrayList;

public class annotationImplementation {
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes") //-> suppress warning of adding generic
		ArrayList a = new ArrayList();
		
		
		Integer i = new Integer(10); // Deprecated
		
		/*
		
		 To create custom annotation we use @interface element
		 There are 3 types of annotation:
		 which are -> 1. Marker, Single-value, multi-value
		 
		 Marker annotation has zero methods. Example: @Override, 
		 Single-value annotation has only one method. 
		 Multi-value annotation has more than one methods.
		 
		 there are two built-in annotations used in custom annotations in java.
		 These are @Target, @Retention
		  
		 
		*/
		
	}

}
