package Hierarchial_Inheritance;

/*
  Hierarchial Inheritance
  One class is super class for multiple child classes
 */ 
public class Hindustan_Uniliver {
   
    Hindustan_Uniliver (){
        System.out.println("Hindustan_Uniliver Constructor");
    }
}
class Horlicks extends Hindustan_Uniliver {
    
    Horlicks (){
           
      //  System.out.println("Horlicks Constructor");
        System.out.println("------Calling super class constructor---------");
        super();
    }
}
class KwalityWalls extends Hindustan_Uniliver{
   
    KwalityWalls (){

        System.out.println("KwalityWalls Constructor");
    }

    public static void main(String[] args) {
        KwalityWalls kw = new KwalityWalls();
    }
}
