package DSA.Recursion;

public class print_sum_of_n_natural_nos {
    
    static void printNaturalNos(int i,int sum){

        if(i<1){
            System.out.println(sum);
            return;
        }
        printNaturalNos(i-1,sum+i);
    }
    public static void main(String[] args) {
        
       printNaturalNos(5,0);
    }
}
