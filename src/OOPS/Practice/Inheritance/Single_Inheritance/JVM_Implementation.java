package Single_Inheritance;
/*
 *  Single Level Inheritance
 * Each class has a single parent class
 */
public class JVM_Implementation {
    
    JVM_Implementation(){
        System.out.println("Super class constructor");
    }
    int a =10;
    int b =20;
    private int c =100;

    public void classLoader(){
        System.out.println("Class Loader");
    }
    public void methodAread(){
        System.out.println("Method area");
    }
    public void heapArea(){
        System.out.println("Heap Area");
    }
    public void testSuperClass(){
        System.out.println("testSuperClass method");
    }

    public void setSuperClassPrivateVariable(int c){
        this.c = c;
    }
    public int getSuperClassPrivateVariable(){
        return c;
    }
}
class WindowsJVM extends JVM_Implementation{

    public WindowsJVM(){
        System.out.println("Calling Super Class Constructor from Sub-class Constructor");
        super();//calling super class constructor
    }
    //variable hiding
    //same name as super class variable
    int a =10;

    public void classLoader(){
      System.out.println(" Windows Class Loader");
      System.out.println(b);
      System.out.println(super.a);//accessing super class variable

    }

    public void methodAread(){
        System.out.println(" Windows Method area");
    }
    public void heapArea(){
        System.out.println("Windows Heap Area");
    }

    public void test(){
        testSuperClass();
        int c = super.getSuperClassPrivateVariable();
        System.out.println("Super class Private variable 'c' accessing using getterSetter: " + c);
    }

 
    public static void main(String[] args) {
        
        WindowsJVM windowsJVM = new WindowsJVM();
        windowsJVM.classLoader();
        windowsJVM.methodAread();
        System.out.println(windowsJVM.a);
        System.out.println();

        windowsJVM.test();
   

    }
}
