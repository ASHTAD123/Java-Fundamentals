package OCA_Prep.Interfaces;

public interface  static_interface_methods {
   
    //static interface methods must have concrete body
   
    //static interface methods are declared using static keyword
    //legal
    public static int m1(){return 0;}

    static int m11() {
        return 0;
    }
    
  // static interface methods are public by default
  // public modifier is optional

  // static methods cannot be marked as private
  // private static int m11(){return 0;}

  // static methods cannot be marked as protected
  // protected static int m12(){return 0;}

  // static methods cannot be marked as final
  // final static int m1(){return 0;}

  // static methods cannot be marked as abstract
  //  abstract int m1(){return 0;}

}
