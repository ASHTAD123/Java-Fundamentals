package DSA.Recursion;

public class Print_Name_N_Times {
    
    static int count =0;

    static void printName(int i, int n){

        if(i>n) return;
        System.out.println("ash");

        printName(i+1,n); //1,4  // 2,4 // 3,4
    }

    public static void main(String[] args) {
        int n =4;
        printName(1,n);
    }
}
