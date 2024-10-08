package Concepts.variables;

public class variables_types_01 {

	// Instance variable
	// not mandatory initialization required
	// can be accessed only using object
	int a = 10;
	int b;

	// static variable
	// single copy of the variable is created and shared among all objects at the
	// class level.
	//We can create static variables at class-level only. 
	//	static block and static variables are executed in order they are present in a program.
	static int s1 = 10;
	static int s2;

	// Constructor
	public variables_types_01(int a) {

		int a1 = 12;

		System.out.println("Constructor called");

		this.a = a;
		System.out.println("Local variable 'a1' inside constructor :" + a1);
		System.out.println("Instance variable 'a' initialized inside contructor :" + a);
	}

	public static void main(String[] args) {

		variables_types_01 vt = new variables_types_01(10);
		vt.method1();
		vt.a = 20;
		System.out.println("Modified the instance variable 'a' : " + vt.a);
		System.out.println("Default value of instance variable 'b' : " + vt.b);
	}

	/*
	 * local variable should be initialized before use Local variables in
	 * constructors cannot be declared with access modifiers like public, private,
	 * or protected. They must be initialized before use. They are stored on the
	 * stack, unlike instance variables which are stored on the heap.
	 */

	public void method1() {

		System.out.println("-----method 1 called-------");

		// can be declared inside a method ,block,constructor
		int c = 10;
		System.out.println("accessing local variable 'c' :" + c);
	}
}
