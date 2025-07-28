package OCA_Prep.Arrays;

public class Multi_Dimension_Array {
    
    public static void main(String[] args) {
        
        int [][] vars1;
        int vars2[][];
        int[] vars3[];
        int[] vars4[],vars5[];
        int[] vars6[], vars7[][];

        String[][] rectangle = new String[3][2];
        rectangle[0] = new String[]{"ABV","CDF"};
        rectangle[1] = new String[]{"BNM","BVX"};
        rectangle[2] = new String[]{"MKL","CWE"};
    
        //System.out.println(rectangle[1][1]);
    
        
        for(int i=0 ; i<rectangle.length; i++){

            for(int j=0; j<rectangle[i].length; j++){
                System.out.print(rectangle[i][j] +"\t");
            }

            System.out.println();
        }
    

        // for(String[] element :rectangle){

        //       for(String innerElement :element){

        //             System.out.print(innerElement + "\t");
        //      }
            
        // }
        

        int[][] intArr = new int[3][3];
        intArr[0][0]= 1;
        intArr[0][1]= 2;
        intArr[0][2]= 3;
        intArr[1][0]= 2;
        intArr[1][1]= 3;
        intArr[1][2]= 4;
        intArr[2][0]= 4;
        intArr[2][1]= 4;
        intArr[2][2]= 4;


    }
}
