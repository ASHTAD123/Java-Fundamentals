package OOPS.interitance.Hierarchial;

public class Parent {

	public void behaviour() {
		
		System.out.println("Parent Behaviour");
	}
	
	public static void main(String[] args) {
		
	}
}
class Child_1 extends Parent{
	
	public void behaviour() {
		
		super.behaviour();
		System.out.println("Additionally Child 1 behaviour");
	}
	
	public static void main(String[] args) {
		
	}
}
class Child_2 extends Parent{
	
	public void behaviour() {
		
		super.behaviour();
		System.out.println("Additionally Child 2 behaviour");
	}
	
	public static void main(String[] args) {
	
		Child_2 child2 = new Child_2();
		child2.behaviour();
	}
}
