package Concepts.Interfaces;

class test1 extends test implements user {
	
	
	public static void main(String[] args) {
		System.out.println("test 1 class");
		test1 t1 = new test1();
		t1.createUser();
		t1.updateUser();
	}

	@Override
	public void updateUser() {
		System.out.println("update user from child class test 1");	
	}
	
	@Override
	public void createUser() {
		System.out.println("create user from child class test 1");
		
	}
}