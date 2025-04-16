public class Staircase {

  public static void main(String[] args) {
    staircase(6);
  }
  
  public static void staircase(int n) {

  
    //no of rounds
    for (int i=0; i<=n+i-1; i++) {
      
      n--;
      //for space
      for (int j=n-1; j>=0; j--) {
        System.out.print(" ");
      }
    
      //for hash
      for (int k = 0; k<=i; k++) {
        System.out.print("#");
      }

      System.out.println();
    }
  
  }

}
