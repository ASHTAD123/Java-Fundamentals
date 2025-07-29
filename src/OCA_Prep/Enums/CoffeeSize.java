package OCA_Prep.Enums;

public enum CoffeeSize {

    BIG(20),HUGE(30),
    
    OVERWHELMING(50){

            public String getLidCode(){

                return "A";
            }

    };

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces(){
        return ounces;
    }

    public String getLidCode(){

        return "B";
    }
}
class Coffee{

        CoffeeSize size;

        public static void main(String[] args) {
            
            Coffee drink_1 = new Coffee();
            drink_1.size = CoffeeSize.BIG;
        
            Coffee drink_2 = new Coffee();
            drink_2.size = CoffeeSize.HUGE;

            Coffee drink_3 = new Coffee();
            drink_3.size = CoffeeSize.OVERWHELMING;

           System.out.println(drink_1.size.getOunces());

            // for(CoffeeSize cs : CoffeeSize.values()){
            //     System.out.println(cs + " " + cs.getOunces());
            // }

        }
}