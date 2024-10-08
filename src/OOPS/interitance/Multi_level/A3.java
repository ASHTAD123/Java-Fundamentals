package OOPS.interitance.Multi_level;

public class A3 extends A2{

	 
	public void m1() {
		 System.out.println("Class A3 m1()");
	 }
	 
	public static void main(String[] args) {
		
		A3 a3 = new A3();
		a3.m1();
		
		A2 a2 = new A3();
		a2.m1();
		a2.accessSuperMethod();
		
		A1 a1 = new A2();
		a1.m1();
		
		
	}
}
