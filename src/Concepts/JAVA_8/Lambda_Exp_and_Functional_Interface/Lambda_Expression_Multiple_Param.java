package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

public interface Lambda_Expression_Multiple_Param {
    
    int operation(int a , int b);
}

 class Test_Lambda_Expression_Single_Param{

    public static void main(String[] args) {
        
        //here without creating separate class we are defining multiple impls
        Lambda_Expression_Multiple_Param add =(a,b) -> a+b;
        Lambda_Expression_Multiple_Param sub =(a,b) -> a-b;

        System.out.println(add.operation(10,10));
        System.out.println(sub.operation(10,10));
    }
}
