package OCA_Prep.Arrays;

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

         objects[0] = new StringBuilder();//careful ArrayStoreException
    }
}
