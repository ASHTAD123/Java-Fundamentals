package OCA_Prep.Numeric_Promotion;

public class Example_2 {
 
public static void main(String[] args) {
    
    // int x=6;
    //int z = ++x -> z=7 , int z =x++;->z=6 -> x=7

    int x=3;
    int y = ++x * 5 / x-- + --x;

    // int y = 4 * 5 / x-- + --x;
    // int y = 4 * 5 / 4 + --x; x will get decremented
    // int y = 4 * 5 / 4 + 2; x is assigned the value of 2

    //x=2 , y=7

    System.out.println(x);
    System.out.println(y);

}
}
