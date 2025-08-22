package OOPS.Overloading;

import java.io.IOException;

public class case_5 {
    
    //these 2 are overloaded methods
    public void a(int a, int b){

    }

    public void a(float a, int b) {


    }

    //Overloaded methods can change return-type
    public int a(char c, int b) {

        return 3;
    }

  
    public int d(char c, int b) throws IOException {

         return 3;
    }

    //Overloaded methods can throw Broader Exceptions
    public int d(double d, int b) throws Exception{

        return 3;
     }

     //A method can be overloaded in Subtype
     public d1 d(int d, int b) throws Exception {
        d1 dd=new d1();
         return dd;
      }

    // A method can be overloaded in Same Type
    public case_5 d(float f, int b) throws Exception {
        case_5 c5 = new case_5();
        return c5;
    }

  
    // A method can be overloaded in different Type
    public case_4 d(long f, int b) throws Exception {
      case_4 c4 = new case_4();
      return c4;
   }

  public void f(){
    System.out.println("Super class version f() ");
  }

  private  void f(int a) {
    System.out.println("Super class version f() ");
  }

    public static void main(String[] args) {
        

        case_5 case_5 = new d1();
        case_5.f(); //overloaded methods are called based on super-type regardless of object
    }
}

class d1 extends case_5{

    //     public void f(){
    // System.out.println("Subclass class version f() ");
    //     }
}