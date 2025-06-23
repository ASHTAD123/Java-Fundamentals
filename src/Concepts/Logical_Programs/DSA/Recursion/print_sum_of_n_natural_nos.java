package DSA.Recursion;

public class print_sum_of_n_natural_nos {
    
    public static void printSumOfNaturalNos(int i,int sum){

        if(i<1){
            System.out.println(sum);
            return;
        }

        printSumOfNaturalNos(i-1, sum+i);
    }

    public static void main(String[] args) {
        
        int n=10;
        printSumOfNaturalNos(5, 0);
    }
}
