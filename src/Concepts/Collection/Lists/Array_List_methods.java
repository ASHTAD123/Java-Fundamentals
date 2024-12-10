package Concepts.Collection.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class Array_List_methods {

	public static void main(String[] args) throws Exception {

		ArrayList<String> arrList = new ArrayList<String>();

		// add()
		arrList.add("C");
		arrList.add("C++");
		arrList.add("Java");
		arrList.add("MYSQL");
		arrList.add("Python1");
		arrList.add("Python2");
		arrList.add("Python1");


		System.out.println("Array List elements :");
		System.out.println(arrList);
		
		System.out.println("Array List size : " +arrList.size());

		// indexOf (shows 1st occurrence)
		System.out.println("first occurrence at index : " + arrList.indexOf("Python1"));

		// lastIndexOf (shows last occurrence)
		System.out.println("last occurrence at index : " + arrList.lastIndexOf("Python1"));

		System.out.println();
		System.out.println(" Original object before shallow copy : " +Arrays.toString(arrList.toArray()));
		
		// clone()-creates a shallow copy
		ArrayList<String> arrListShallow = (ArrayList<String>) arrList.clone();
		
		System.out.println(" Shallow copy created : " + Arrays.toString(arrListShallow.toArray()));
		System.out.println();
		
		System.out.println(" Original object after shallow copy : " +Arrays.toString(arrList.toArray()));
		System.out.println();

				
		// toArray()
		Object[] arr = arrList.toArray();
	//	System.out.println(Arrays.toString(arr));

		
		System.out.println("");
	 
		// toArray(T[] a)
	 	// returns array as per its data type 	& creates new array with new size if array doesn't fit in 
	 	String[] strArr = new String[2];
	 	System.out.println("==Length of string array before executing toArray() : " + strArr.length);
	 	strArr = arrList.toArray(strArr);
	 	System.out.println("=====Converting Array List to array & storing in String array reference type");
	 	
	 	System.out.println("==Length of string array " + strArr.length);
		System.out.println();
		
		   
		for(String item : strArr) {
			System.out.println(item);
		  }

		//	spliterator()
		ArrayList<Integer> arI= new ArrayList<Integer>();
		
		for(int i=0 ; i<=10 ;i++) {
			arI.add(i);
		}
		
		Spliterator<Integer> nums = arI.spliterator();
		
		nums.forEachRemaining(
			(n)->{
				 System.out.println(n*100+",");
			});
		System.out.println();
		
		
		
		
		
	}
}
