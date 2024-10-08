package Concepts.initializer_Block;

public class example_1 {

	int age;
	
	//initializer block
	{
		age=10;
		System.out.println("Initializer Block");
		System.out.println("Variable initilized a= "+age);
	}
	
	//Default Constructor
	example_1(){
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) {
		
		example_1 ex1 = new example_1();
	}
}
