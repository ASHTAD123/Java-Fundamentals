package OOPS.Overriding;

class Problem_1 {
    
    public Object m1(){
        return null;
    }
}

class Problem_2 extends Problem_1 {
   
    //co-variant return types 
    //here String return type is child of Object
    //**** but vice versa is not possible*****
    public String m1(){
        return null;
    }

    public static void main(String[] args) {
        
    }
}
