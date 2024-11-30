package Concepts.Collection.constructors;

public class parameterized_constructor {

	
		String name ="Ash";
		int a =10;
		
		parameterized_constructor(String name,int a){
			this.name = name;
			this.a = a;
		}
		
		public static void main(String[] args) {
			
			parameterized_constructor pc = new parameterized_constructor("as",12);
			
			System.out.println("Printing parameterized constructor");
			System.out.println(pc.name);
			System.out.println(pc.a);
			
		}
}
