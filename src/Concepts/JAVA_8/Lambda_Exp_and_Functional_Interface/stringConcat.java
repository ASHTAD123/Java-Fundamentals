package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

public interface stringConcat {

  void stringConcatMethod(String a, String b);  
} 

 class stringConcatImpl {

   public static void main(String[] args) {

    String a1 = "ash";
    //Implementation
    stringConcat sc = (a,b)->{
      System.out.println(a+b);
    };
    
    //Calling
    sc.stringConcatMethod(a1, "tad");
  } 
}
