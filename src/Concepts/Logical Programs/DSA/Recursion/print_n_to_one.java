package DSA.Recursion;

public class print_n_to_one {
   
    public static void main(String[] args) {
        
        print_n_to_one_numbers(5,1);
    }

    public static void print_n_to_one_numbers(int start,int n){

        if(start < n)
            return;

        System.out.println(start);

        print_n_to_one_numbers(start-1,n);
    }
}
