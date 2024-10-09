package Concepts.Interfaces;

//Multiple Inheritance using inheritance Interfaces
public interface interface1 {
	void a();

	void display();
}

interface interface2 extends interface1{

	void a();
}

@SuppressWarnings({ "Used to show multiple inheritance", "unused" })
class ac implements interface1, interface2{

	@Override
	public void a() {
		System.out.println("a method from ac class");
	}

	@Override
	public void display() {
		System.out.println("display method implemented from interface1");
	}

	
	public static void main(String[] args) {
		ac ac= new ac();
		ac.a();
	}

	
}

