package OCA_Prep.Data_Type_Conversion;

public class example_3 {
    
    public static void main(String[] args) {
        
        //Exponential form
        double d = 1.9e3;
       
       // float f = 1.2e3; //Invalid

        float f = 1.2e3F;

        double d_1 = 10;

        float f_1 = 10;

        float f_2 = 20f;

        float f_3 = 0xBeef; //valid because hexa decimal comes under integral

        double d_2 = 0xface; 

        //Long can be stored because internal memory representation is different
        //float is greater than long
        float f_4 = 10L;

        //from 1.8 onwards additional type is added
        //boolean
        int x = 0B111;

        System.out.println(x);





    }
}
