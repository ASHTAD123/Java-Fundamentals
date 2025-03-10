public interface annonymous{ 

public abstract void sayHello();

}

 class test{

		public static void main(String args[]){

			annonymous annImpl = new annonymous(){
				public void sayHello(){
					System.out.println("SAY HELLP IMPLEMEN");
				}
			};

			annImpl.sayHello();
		}

	
}