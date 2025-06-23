package DSA.Recursion;

public class print_N_Times {
    

    public static void main(String[] args) {
        int n=4;
        print_Name_N_times(1, n);
    }

    public static void print_Name_N_times(int i,int n){

        if(i>n)
              return;

        System.out.println("Ash");

        print_Name_N_times(i+1, n);

    }
}
