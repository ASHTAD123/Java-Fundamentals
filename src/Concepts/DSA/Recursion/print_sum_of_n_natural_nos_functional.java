package DSA.Recursion;

public class print_sum_of_n_natural_nos_functional {
    
    static int printNaturalNos(int i){

            if(i==0){
                return 0;
                }
       return i + printNaturalNos(i-1);
    }
    public static void main(String[] args) {
        
       printNaturalNos(5);
    }
}
