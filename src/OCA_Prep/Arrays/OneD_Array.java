package OCA_Prep.Arrays;

import java.util.Arrays;

public class OneD_Array {
    
    public static void main(String[] args) {
        
        int x,y=10;

        int numbers[] = new int[3];
        
        //Annonymous array
        int[] numbers1 = new int[]{5,4,3,20,1};

        int [] numbers2 = {0,1,2,3,4,5};


        int[] ids,types; //2 int arrays

        int id1[], type1; //1 array, 1 int

        String [] bugs ={"cricket","beetle","ladybug"};

        String[] alias = bugs;
        System.out.println(bugs.equals(alias));//true
        System.out.println(bugs.toString());//hashcode

        String names[];//null

        String names1[] = new String[2];//[null,null]


        //Casting 
        String[] strings={"ashtad"};
        Object[] objects = strings;
        String[] againStrings = (String[])objects;

        // againStrings[0] = new StringBuilder(); Doesn't compile

      //  objects[0] = new StringBuilder();//careful ArrayStoreException

        // Searching

        //tim sort -merge sort +insertion sort - reference types
        //dual pivot quick sort
        int sortNumbers[] ={6,9,1};
        Arrays.sort(sortNumbers,1,3);
        System.out.println(Arrays.toString(sortNumbers));

        //Lexographically sorts the strings
        String[] strings1 = {"10","9","100"};
        Arrays.sort(strings1);
        System.out.println(Arrays.toString(strings1));

        //Searching
        //binary search only works on sorted array
        //if we pass un-sorted array then result is unknown
        int numbers3[] = {2,4,5};
        System.out.println(Arrays.binarySearch( numbers3, 4));
        System.out.println(Arrays.binarySearch( numbers3, 8));
        //returns value and negates the position where it should be present & subtracts -1
        // so 8 should be present at lastIndex-1
    
    
    
    
    
    
    
    }
}
