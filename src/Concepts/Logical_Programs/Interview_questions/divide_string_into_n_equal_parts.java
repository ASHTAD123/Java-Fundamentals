 package Interview_questions;

public class divide_string_into_n_equal_parts {
    
    public static void main(String[] args) {
        
         // length of string is 28
         String str = "Asim";
         divideString(str,2);
    }

    public static  void divideString(String str,int numberOfparts){

        int strLen = str.length();
        int partSize=0;

        if(strLen % numberOfparts !=0){
        
            System.out.println("Invalid Input: String size" + "is not evenly divisible by n");
            return;
        }

        partSize = strLen / numberOfparts;
        System.out.println("PART SIZE :" +partSize);

        for(int i=0; i< strLen; i++){

            if( i % partSize==0){
                System.out.println();
            }
            System.out.print(str.charAt(i));
        }
    }
}
