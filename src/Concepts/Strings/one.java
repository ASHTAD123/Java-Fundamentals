package Concepts.Strings;

public class one {

		public static void main(String[] args) {
				
			String w = "w";
			String w1 = "w";	
			String w2 = new String("w");

			String w3 = new String("w");
			System.out.println(w2.equals(w3));
			System.out.println(w2==w3);
			
			//compares only values
			System.out.println(w.equals(w1));
			System.out.println(w.equals(w2));
			
			//compares reference
			System.out.println("Hash codes");
			System.out.println(w.hashCode());
			System.out.println(w1.hashCode());
			System.out.println(w2.hashCode());
			System.out.println(w==w1);
			System.out.println(w==w2);
		}
}
