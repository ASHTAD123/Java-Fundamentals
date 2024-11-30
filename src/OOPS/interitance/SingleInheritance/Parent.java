package OOPS.interitance.SingleInheritance;

public class Parent {
		
		public void behaviour() {
			System.out.println("Parent behaviour");
		}
		
		public void eatingHabbits() {
			System.out.println("Parent eating habbit");
		}

		public void perosnality() {
			System.out.println("Parent personality");
		}
		
		public void dressingSense() {
			System.out.println("Parent dressing sense");
		}
		
		public static void main(String[] args) {
			
		
		}
}

class Child extends Parent{
	
	
	public void behaviour() {
		System.out.println("Child behaviour");
	}
	
	public void eatingHabbits() {
		System.out.println("Child eating habbit");
	}

	public void perosnality() {
		System.out.println("Child personality");
	}
	
	public static void main(String[] args) {
		
		//Parent reference , parent object
		Parent parent = new Parent();
		parent.behaviour();
		parent.eatingHabbits();
		
		//Child reference , child object
		Child child = new Child();
		child.behaviour();
		child.eatingHabbits();
		child.dressingSense();
		
		//Parent reference , child object
		Parent parent1 = new Child();
		parent1.behaviour();
		parent1.dressingSense();
	}
}
