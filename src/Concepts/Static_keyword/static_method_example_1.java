package Concepts.Static_keyword;

public class static_method_example_1 {

	int a =10;
	static int b =20;
	
	public static void main(String[] args) {
		//static variables are accessed in both static & non-static ()
		System.out.println(b);
	}
	
	public void bc() {
		//static variables are accessed in both static & non-static ()
		System.out.println(b);
	}
	
	public static void abc() {
		
	//static method do not have access to instance variables
	//	System.out.println(a);
	
	}
}
