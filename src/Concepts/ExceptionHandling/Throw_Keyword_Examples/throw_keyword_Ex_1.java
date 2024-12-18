class throw_keyword_Ex_1{

    static void method1(){

        try{
                throw new NullPointerException("Null pointer Exception explicity thrown using throws keyword");
       
        }
        //here it checks if there is any matching type of exception,if not then looks for next try block
        catch(Exception ne){
                System.out.println("Catch Block in method1() ");
                 throw ne; //Rethrowing exception
        }
    }

    public static void main(String[] args) {
        
      try{
        method1();
      }
        catch(NullPointerException ne){
        System.out.println("Caught in main ()");
      }
    }
}