package OCA_Prep.Methods;

public class example_1 {
    

    public void walk1(){}

    // default void walk2(){} does not compile

    // void public walk3() wrong declaration
    // Format : returnType methodName()
    
    public final void walk2(){

    }

    public static final void walk3(){

    }

    final public static void walk4(){

    }

    //public void final walk6{ }

    void add_1(int a,int b){
        return; //not mandatory
    }


    boolean check(int a){

        if(a==5)
            return true;

        return false;
    }

    public String name(){

        return null;
    }

     public Integer name1(){

        return null;
    }

    // Compilation error
    //  public int name2(){
    //     System.out.println("name2");
    //     return null;
    // }

     float name_3(){
        return 1222222222222222222L;
    }

    void walk11();//valid

    //void 2walk();//invalid

    // void void(); //invalid

    void walk_$(){} //valid

    // void() //invalid


    //invalid
    // int method_1(int a; intb){

    // }


    //invalid
    // int method1{

    // }

    void method21() throws ArrayIndexOutOfBoundsException{

    } 

     void method22() throws ArrayIndexOutOfBoundsException,IllegalArgumentException{

    } 
    public static void main(String[] args) {
        
        System.out.println("___MAIN METHOD___");
        example_1 e1 = new example_1();
       
      //  System.out.println(e1.name2());

    }


}
