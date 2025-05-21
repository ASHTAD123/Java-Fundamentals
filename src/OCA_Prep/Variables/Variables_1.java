package OCA_Prep.Variables;

public class Variables_1 {

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
    //int public;


    public static void main(String[] args) {
        
    }

}
