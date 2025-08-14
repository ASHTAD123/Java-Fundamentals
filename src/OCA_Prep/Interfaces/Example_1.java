package OCA_Prep.Interfaces;

public interface Example_1 {
    
    public int x =1; //implicity static and final

    // looks default but implicity static and final
    int x1 = 2;

    // doesn't show final or public but implicitly it is
    static int x11=2;

    // doesn't show static or public but implicitly it is
    final int d1 =20;

   // doesn't show final but implicitly it is
    public static int e2 = 0;

   // doesn't show static but implicitly it is
   public final int A = 0;

    public abstract  void abs();

    public void avs();

  // final and abstract cannot go together
  // public final abc1();

  // interface methods cannot be strictfp
  // public strictfp aca();

  // interface methods cannot be native
  // public native as();

  // interface methods cannot be private
  // private asc();

  //implicity public static final
  //cannot declare instance variables
  int d=20;

  // d=30;

  // interface methods cannot be final
  //   final int m();

  // interface methods cannot be strictfp
    // strictfp int m();

  // interface methods cannot be native
  //   native int m();
  
  // in java 8 main method is allowed in interfaces
  public static void main(String[] args) {
        System.out.println("as");
    }
}

//interface can extend another interface
interface  Example_2 extends Example_1{

}

class  c{}
// interface cannot implement a class or another interface
// interface a implements c{}
// interface a implements Example_2{}
