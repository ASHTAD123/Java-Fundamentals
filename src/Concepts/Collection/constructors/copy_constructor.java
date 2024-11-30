package Concepts.Collection.constructors;

class copy_constructor {

			public static void main(String args[] ) {
				
				System.out.println("Parameterized Constructor :");
				cd cc = new cd("as", 13);
				System.out.println(cc.name);
				System.out.println(cc.num);
				
				cd cdObj = new cd(cc);
				System.out.println("Copy Constructor :");
				System.out.println(cdObj.name);
				System.out.println(cdObj.num);
			}
	
}
class cd{

	String name;
	int num;
	
	 // Parameterized Constructor
	cd(String name,int n) {
		
		this.name=name;
		this.num = n;
	}
	
	 // Copy Constructor
	cd(cd cc) {
		
		this.name= cc.name;
		this.num = cc.num;
	}
	

}
