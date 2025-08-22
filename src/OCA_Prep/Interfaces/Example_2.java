package OCA_Prep.Interfaces;

interface Example_2 {

  int A = 20;

  public default void c() {
    System.out.println("Default method ");
  }

  public static void c1() {
    System.out.println("Static method ");
  }

  public static void main(String[] args) {
    System.out.println("Main inside interface");
    c1();
  }
}

interface Example_3 extends Example_2 {

  public default void c() {
    System.out.println("Default method inherited ");
  }

  public static void main(String[] args) {
    Example_2.c1();//Static method can be accessed
    System.out.println(A);
  }
}

class c implements Example_3 {

  public static void main(String[] args) {
    c c1 = new c();
    c1.c();
    c1.runInheritedDefaultMehtod();

    //ref variable can be of Interface type
    Example_3 example_3 = new c();
    example_3.c();

  }

  //we can inherit default method from an interface
  public void runInheritedDefaultMehtod(){
    c();
  }

}
class d{}
