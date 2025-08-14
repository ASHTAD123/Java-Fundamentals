package OCA_Prep.Access_Modifiers.cousin_house;

import OCA_Prep.Access_Modifiers.Father;
import OCA_Prep.Access_Modifiers.Mother;

public class EldestSon extends  Mother {
    

    // protected void money(){
    //     System.out.println("I can give money to my son and daughter");
    // }
    public static void main(String[] args) {

       //eldest son asking money from mother using it's own object
       // because protected methods in different package can be accessed in sub-classes with sub-classe's type only
       EldestSon son = new EldestSon();
       son.money();

      Father father = new Father();
      father.pocketMoney(); //public method
    }
}
