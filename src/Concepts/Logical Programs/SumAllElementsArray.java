public class SumAllElementsArray {
    
    public static void main(String[] args) {
        
        int[] array = { 1, 2, 3, 4, 5 };

        int sum = 0;
       
        System.out.println(array.length);
       
        for(int i=0; i < array.length; i++){
           
            System.out.println(array[i]); 
             //   sum = sum + i; //0 + 1 =1  1+1=2  2+2=4  4 + 3 = 7  7 + 4
        }
        System.out.println("Sum : " +sum);
    }
}
