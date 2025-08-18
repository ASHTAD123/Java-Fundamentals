package OCA_Prep.Constructors;

public class valid_invalid_types {

  // ------------ Valid Types---------------

  public valid_invalid_types() {
    System.out.println("a");
  }

//   valid_invalid_types() {
//         System.out.println("a");
//      }

  // valid_invalid_types(){

  // }

  // private valid_invalid_types(){

  // }

  valid_invalid_types(int a){

  }

  valid_invalid_types(int a,int... y) {

  }

  public static void main(String[] args) {
    valid_invalid_types a = new valid_invalid_types();
  }
  // ------------ Invalid Types---------------

  //   void valid_invalid_types(){} //it's not a constructor it's a method

  //   valid_invalid_types1(){} //it's not a method nor constructor

  // static valid_invalid_types(){} //constructor cannot be static

  // final valid_invalid_types1(){} //constructor cannot be final

  // abstract valid_invalid_types1(){} //constructor cannot be abstract

  //  valid_invalid_types1(int... a,int b){} //bad var-args syntax

}
