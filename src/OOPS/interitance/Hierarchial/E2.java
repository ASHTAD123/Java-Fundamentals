package OOPS.interitance.Hierarchial;

public class E2 extends E {

	public void print() {
		System.out.println("E2 class print()");
	}
	
	public static void main(String[] args) {
		
		E e = new E1();
		e.print();
		
		E e1 = new E2();
		e1.print();
		
		
	}
}
