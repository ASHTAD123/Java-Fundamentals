package OCA_Prep.OOPS.Interitance;

public class A {
    
    public void methodA(){
        System.out.println("A");
    }
}

class B3 extends A{


  public void methodC(){
    methodA();
  }
        public static void main(String[] args) {
        B3 b3 = new B3();
        b3.methodC();
        
        }
}
