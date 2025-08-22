package OOPS.Overriding;

import java.io.IOException;

public class Problem_5 {
    
    public void m(){}

  protected void m1() {}

    void c(){

    }

  void c1() throws Exception{

  }

  void c2() throws Exception {}

  p5 c3() throws Exception {}

  final void a(){

  }
}
class p5 extends Problem_5{
 
    //final method cannot be overriden
    //  void a() {

    // }

     // cannot have weaker access
     //  void m() {}

    //overriding method cannot throw checked exception unless super class has thrown it
    // void c ()throws SQLException{

    // }
    //overriding method can throw runtime exception regardless of super class declares or not
    public void m() throws RuntimeException{}

    //overriding method can throw narrower exception
    public void c1() throws IOException {

     }

  // overriding methods cant change return type except for co-variant return types
  // int c2() throws Exception {

  // }

     //Co-variant Return types in Overriding case
    p5 c3() throws Exception {

      p5 p = new p5();
      return p;
    }

  public void c() {
        System.out.println("c");
    }

    public static void main(String[] args) {
        p5 p5 = new p5();
        p5.c();
    }

}
