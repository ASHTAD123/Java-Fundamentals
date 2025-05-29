package OCA_Prep.Operators;

class  Example_1{
    
 public static void main(String[] args) {
    int z=6;
 

    //SHORT CIRCUIT OPERATORS

    if(z>=6 | ++z <=7){
    
        //here 7 will be the O/P because it evaluates both the expressions
        // even if first is true
        System.out.println(z);
    }
 
     if(z>=6 || ++z <=7){
    
        //here 8 will be the O/P because it evaluates only 1 expression
        System.out.println(z);
    }
 

      if(z>=8 && ++z <=7){
    
        //here first expression gets evaluated , resulting in false
        //so 2nd expression doesn't evaluate becuase in && if one exp if false ,another is not checked also
        System.out.println(z);
    }
 
    //Learnt new way of loop
    int a=2;
    while(a++ <10){
      System.out.println(a);
    }
 }
}

