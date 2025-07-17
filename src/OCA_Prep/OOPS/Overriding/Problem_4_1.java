package OCA_Prep.OOPS.Overriding;


public class Problem_4_1 {
    int x = 777;

}
 class Problem_5 extends  Problem_4_1{
    
     int x = 888;
}
 class Test {
    
    public static void main(String[] args) {
        
        //variable resolution always takes care by compiler
        //overriding concept is not applicable for variables
        //regardless of static or non-static
         Problem_4_1 p4 = new  Problem_4_1();
        System.out.println(p4.x);

        Problem_5 p5 = new Problem_5();
        System.out.println(p5.x);

         Problem_4_1 p4_1 = new Problem_5();
        System.out.println(p4_1.x);
    }
   
}
