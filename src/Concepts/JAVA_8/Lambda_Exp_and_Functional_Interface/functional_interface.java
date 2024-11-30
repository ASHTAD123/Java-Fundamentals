package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

public interface functional_interface {
	
		//1 abstract method + any number of static & default methods
		public void m1();
		
		default void m2() {
			
		}

		public static void m3() {
			
		}
}
