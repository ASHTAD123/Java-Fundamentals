package DSA.Recursion;

public class print_sum_of_n_natural_nos_functional_way {
    
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(3));
    }

    public static int sumOfNumbers(int i){

        if(i==0)
            return 0;

         return i +sumOfNumbers(i-1)   ;
    }
}
