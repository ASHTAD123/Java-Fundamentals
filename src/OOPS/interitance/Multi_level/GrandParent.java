package OOPS.interitance.Multi_level;

public class GrandParent {

	public void habbits() {
		
		System.out.println("Grand Parent Habbits");
	}
	
	public static void main(String[] args) {
		System.out.println("Grand Parent class");
	}
}

class Parent extends GrandParent{
	
	public void habbits() {
		
		System.out.println(" Parent Habbits");
	}
	

	public static void main(String[] args) {
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	
	public void habbits() {
		
		System.out.println("Child Habbits");
		super.habbits();
	}
	
	public static void main(String[] args) {
		System.out.println("Child class");
		
		Child child = new Child() ;
		child.habbits();
	}
}
