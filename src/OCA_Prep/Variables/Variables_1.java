package OCA_Prep.Variables;

public class Variables_1 {

    //legal identifiers
    int _a;
    int $c;
    int __________2_w;
    int _$;
    int this_is_legal_detailed_name_of_an_identifier;
    int $_3;
    int $_2we;

    /* Invalid Types
     * 
     * int :b;
     * int -d;
     * int e#;
     * int .f;
     * int 7g;
     */


    String s1, s2;
    String s3= "yes" , s4="no";

    int i1, i2 ,i3 =0;//only i3 is initialized

    //legal
    boolean b1,b2;

    //legal
    String s33 ="1",s22; 

    //not legal
    // double d1, double d2; 

    //legal
    int i11; int i22; 

     //not legal
    // int i33; i44;


    int okidentifier;
    int $OKIdentifier;
    int _alsoOk1dentifer;
    int __SStillOkbutKnotGood$;

    //Invalid identifiers
   // int 3DPointClass;
    //int hollywoord@vine;
    //int *$coffee;
    //  int public;


    public static void main(String[] args) {
        
        double d = 0XFace;
        System.out.println(d);

        char c =0x2ef;
        System.out.println(c);

        char c1 =34;
        System.out.println(c1);

    }

}
