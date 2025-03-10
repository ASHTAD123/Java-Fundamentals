package OOPS.interitance.SingleInheritance;

public class F extends E{
   
    F(){
        super();
    }
    public void method1(){
        System.out.println("Method 1 CLASS F"+a);
    }
    public void method2(){
        System.out.println("Method 1 CLASS F");
    }

    public static void main(String[] args) {
        
        //child class object , child ref
        F f = new F();
        f.method1();
        f.method2();
       
        //parent class object , child ref
        E e = new F();
        e.method1();
        e.method2();
    
        //parent class object , parent ref
        E p = new E();
        p.method1();
        p.method2();
    }
}
