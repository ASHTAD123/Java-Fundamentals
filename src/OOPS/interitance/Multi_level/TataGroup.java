package OOPS.interitance.Multi_level;

public class TataGroup {

	public static void main(String[] args) {
		 System.out.println("Tata Group");
	}
	
	public void codeOfConduct() {
		System.out.println("Tata Group Code of conduct");
	}
}

class TCS extends TataGroup{
	
	public void codeOfConduct() {
		super.codeOfConduct();
	}
	public static void main(String[] args) {
		 System.out.println("TCS");
	}
	
	
}

class TCSION extends TCS{
	
	public void codeOfConduct() {
		super.codeOfConduct();
	}
	public static void main(String[] args) {
		 System.out.println("TCS ION");
	
		 TCSION ion = new TCSION();
		 ion.codeOfConduct();
	}
}
