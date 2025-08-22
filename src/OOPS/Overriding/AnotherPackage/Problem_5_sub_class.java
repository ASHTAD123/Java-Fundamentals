package OOPS.Overriding.AnotherPackage;
import OOPS.Overriding.Problem_5;

public class Problem_5_sub_class extends Problem_5 {

    public static void main(String[] args) {

        //from sub-class while overriding we can access only public methods using parent-class reference
        //default methods cannot be accessed outside package regardless of any reference
       
        Problem_5 p5 = new Problem_5();
        p5.m();

    // from sub-class while overriding can access only public & protected using sub-class reference
    // protected methods can only be accessed using sub-class reference while outside the class
    Problem_5_sub_class p5S = new Problem_5_sub_class();
         p5S.m1();
         p5S.m();
    }
}
