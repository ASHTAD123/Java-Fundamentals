package OCA_Prep.Interfaces;

public interface Example_Default_methods {
    
    //default methods are bydefault public
    //default methods are declared using default keyword
    default void method1(){

    };

    default int method2(){
        return 1;
    }

    //default methods cannot be static
    // static default void method11(){} 

    //default methods cannot be private
    // private default void method22(){}

    //default methods must have a body
    //default void method3();


     


}
