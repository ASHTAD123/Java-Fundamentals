package OOPS.Method_Hiding;

// Java program to demonstrate
// Difference between method overriding and Method hiding

// Base Class
class Complex {

	public static void f1()
	{
		System.out.println(
			"f1 method of the Complex class is executed.");
	}

	public void f2()
	{
		System.out.println(
			"f2 method of the Complex class is executed.");
	}
}

// class child extend Demo class
class Sample extends Complex {
	
	public static void f1()
	{
		System.out.println(
			"f1 of the Sample class is executed.");
	}
	public void f2()
	{
		System.out.println(
			"f2 method of the Sample class is executed.");
	}
}
public class Main {

	public static void main(String args[])
	{
		Complex d1 = new Complex();
		
		// d2 is the reference variable of class Demo that
		// points to object of class Sample
		Complex d2 = new Sample();
		
		// But here method will be called using type of
		// reference
		d1.f1();
		d2.f1();

		// ***** Function overriding in java *****//
		// method refer to the object in the method
		// overriding.
		d1.f2();
		d2.f2();
	}
}
