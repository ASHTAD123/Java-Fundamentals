package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

import java.util.ArrayList;

public class lambdaExpressionArrayList {
    

    public static void main(String[] args) {
    
        ArrayList<String> pointList = new ArrayList<>();
        pointList.add("1");
        pointList.add("2");
        pointList.add("3");

        pointList.forEach(
            p->{
               System.out.println(p); 
            }
        );
    }
}
