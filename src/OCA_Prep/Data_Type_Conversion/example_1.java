package  OCA_Prep.Data_Type_Conversion;

class example_1{

    public static void main(String[] args) {
        
        // --------Integral types----------------

        //Decimal 0-9
        int x =12; 

        //Octal(base-8) 0-7
        //Starts with 0
        int x1 = 010;
        int x2 = 0777;
        System.out.println(x1);
        System.out.println(x2);


        //Hexa decimal(base-16)
        //0-9 , a-f , A TO F
        int hexa = 0x10;
        int hexa1= 0X10;
        int hexa2= 0xFace;
        int hexa3= 0xBeef;
        // int hexa4= 0xBeeg; CE because 'g' is not in range of a-f 
        System.out.println(hexa);
        System.out.println(hexa1);
        System.out.println(hexa2);
        System.out.println(hexa3);

        //always octal,hexa,are converted to decimal
        
        

    }
}