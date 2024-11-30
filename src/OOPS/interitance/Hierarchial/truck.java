package OOPS.interitance.Hierarchial;

class truck extends vechile{
	
	
	public void speed(int s) {
		
		System.out.println("Speed of truck"+s);
	}
	
	public void gear() {
		System.out.println("Gear of truck");
	}

	public static void main(String[] args) {
		vechile v = new truck();
		v.speed(122);
	}

}