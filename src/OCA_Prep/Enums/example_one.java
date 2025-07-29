package OCA_Prep.Enums;

enum CoffeeSize{BIG,HUGE,OVERWHELMING}//this cannot be private or protected at top-level

//enums declared at top level can only be public
//enums declared inside the class can be private,protected,default ,public
//enums cannot be declared inside a method
//semi colon is optional after enum declaration
public class example_one {
    
    public enum CoffeeSize{BIG,HUGE,OVERWHELMING}
    enum CoffeeSize1{BIG,HUGE,OVERWHELMING};
    protected enum CoffeeSize2{BIG,HUGE,OVERWHELMING}
    private enum CoffeeSize3{BIG,HUGE,OVERWHELMING}

   CoffeeSize size;

    public static void main(String[] args) {
        
        example_one coffee = new example_one();
        coffee.size = CoffeeSize.BIG;

        coffee.size = example_one.CoffeeSize.OVERWHELMING;
    }
}
