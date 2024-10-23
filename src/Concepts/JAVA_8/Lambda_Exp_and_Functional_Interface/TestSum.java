package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

public class TestSum {
 

    public static void main(String[] args) {
      
        sumInterface result = (a,b) ->{
            System.out.println("Sum interface using Java 8 Lambda Expression");
            return a + b;
        };
        sumInterface result1 = (a,b) ->{
            System.out.println("Sum interface using Java 8 Lambda Expression");
            return a + b;
        };
        int res = result.sum(2, 2);
        System.out.println(res);
    }
}
