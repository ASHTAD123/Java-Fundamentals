package Concepts.initializer_Block;

import OOPS.interitance.ex;

public class ex1 extends ex{

	public static void main(String[] args) {
		
		ex1 e1 = new ex1();
		
		System.out.println("Accesing protected member of a class from outside package in a sub-class");
		System.out.println(e1.a);
	}
}
