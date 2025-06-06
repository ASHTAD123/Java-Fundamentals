package OCA_Prep.Access_Modifiers.cousin_house;

import OCA_Prep.Access_Modifiers.Mother;
import OCA_Prep.Access_Modifiers.Father;

public class EldestSon extends  Mother {
    

    protected void money(){
        System.out.println("I can give money to my son and daughter");
    }
    public static void main(String[] args) {
        
        Mother mother = new Mother();

        // by calling this method it's not allowed , protected access modifier only allows method to be inherited in sub-classes
       // mother.money();

       //by this way it's allowed
       EldestSon son = new EldestSon();
       son.money();

      Father father = new Father();
      father.pocketMoney(); //public method
    }
}
