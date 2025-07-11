package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

@FunctionalInterface
public interface  Lambda_Expression_Zero_Param {
    
        void display();
}

class Test{

    public static void main(String[] args) {
        
        Lambda_Expression_Zero_Param lambdaZeroParam = () -> System.out.println("Zero param lambda");
        lambdaZeroParam.display();
        
    }
}
