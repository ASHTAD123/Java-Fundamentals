package DSA.Basic_Math_Problems;

public class GCD_of_numbers_better_approach {

    public static void main(String[] args) {
        
        int findGCD = findGCD(5, 10);
        System.out.println(findGCD);
    }

    public static int findGCD(int n1,int n2){

        for(int i=Math.min(n1, n2); i >0 ;  i--){

            if(n1 % i ==0 && n2 % i ==0){
                return i;
            }
        }
        return 1;
    }
}
