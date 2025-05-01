package DSA.Recursion;

public class print_one_to_n {
    
    public static void main(String[] args) {
        
        print_one_n_numbers(1,5);
    }

    public static void print_one_n_numbers(int start,int n){

        if(start > n)
            return;

        System.out.println(start);

        print_one_n_numbers(start+1,n);
    }
}
