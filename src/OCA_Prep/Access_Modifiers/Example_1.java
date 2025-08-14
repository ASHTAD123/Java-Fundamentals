package OCA_Prep.Access_Modifiers;

public class Example_1 {

  // Pulic Access
  public int a = 10;

  // Default access
  int b = 20;

  // Protected access
  protected int c = 30;

  //Private access
  private int d = 50;

  //final & abstract is Illegal combo , both are opposite
//   final abstract a=0;

   //Non access modifier
   final int af=02;

  // cannot change final variable
  //    af=20;


  public static void main(String[] args) {

     // Local Variables
    //  public int cc = 20 //cannot define public inside method  

    // Default access[Only visible to this method]
    int c = 30;

    // Private access[Not allowed]
    // private cc = 40;
    
    //Protected access[Not allowed]
    //  protected dd = 40;

    // This combination is not allowed
    // strictfp final int a=0;

  }

    public float getSfp() {
        return sfp;
    }
}
