package OOPS.interitance.Hierarchial;

public class HindustanUniliver {

	public void standardProtocol() {
		System.out.println("All sub brands has to follow Standard HUL Protocol");
	}
	
	public void logo() {
		
	}
	
	public static void main(String[] args) {
		
	}
}

class DoveShampoo extends HindustanUniliver{

	public void standardProtocol() {
		super.standardProtocol();
		System.out.println("Dove shampoo protocol");
	}
	
	public static void main(String[] args) {
		
	}
}

class Horlicks extends HindustanUniliver{
	
	public void standardProtocol() {
		super.standardProtocol();
		System.out.println("Horlicks protocol");
	}
	
	public static void main(String[] args) {
		
		Horlicks horlicks = new Horlicks();
		horlicks.standardProtocol();
	}
}
