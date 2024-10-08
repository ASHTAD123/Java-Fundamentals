
package OOPS.interitance.Hierarchial;
class bike extends vechile{	
	
		public void speed(int s) {
			
			System.out.println("Speed of bike"+s);
		}
		
		public void gear() {
			System.out.println("Gear of bike");
		}

		public static void main(String[] args) {
			
			vechile v = new bike();
			v.speed(90);
		}
}

