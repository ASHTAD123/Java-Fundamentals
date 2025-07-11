package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

import java.util.ArrayList;

public class Lambda_Expression_Single_Param {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(" Elements of ArrayList : " + al);

        al.forEach(n-> System.out.println(n));

        System.out.println(" Elements Even of ArrayList : " + al);

        al.forEach( n->{

                if(n %2==0)
                    System.out.println(n);
            }
        );

    }
}
