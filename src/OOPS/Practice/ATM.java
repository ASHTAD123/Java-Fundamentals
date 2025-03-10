public interface ATM {
    public  void deposit();

}
 class myImpl implements ATM{
	
	
	public void deposit(){
		System.out.println("DEPOSIT");
	}
}

public static void main(String agrs[]){

	myImpl impl_1 = new myImpl();
	impl_1.deposit();
}
