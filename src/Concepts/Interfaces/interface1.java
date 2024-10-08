package Concepts.Interfaces;

public interface interface1 {
	void a();
}

interface interface2 extends interface1{

	void a();
}

class ac implements interface1, interface2{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	
}

