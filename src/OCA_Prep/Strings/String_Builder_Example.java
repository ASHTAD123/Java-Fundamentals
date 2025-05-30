package OCA_Prep.Strings;

 class String_Builder_Example {
    
    public static void main(String[] args) {
        
        String s ="Aakash";

        String alpha = "";

        for(char current='a'; current<='z'; current++ )
                alpha = alpha + current;

        System.out.println(alpha);


         StringBuilder alphaMax = new StringBuilder("");
       
         for(char current='a'; current<='z'; current++ )
                alphaMax.append(current);

        System.out.println(alphaMax);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");

        StringBuilder same = sb.append("+end");
        System.out.println(sb);
        System.out.println(same);
    
    StringBuilder a = new StringBuilder("abc");
    StringBuilder b = new StringBuilder("de");
    b = b.append("f").append("g");
    
    System.out.println(a);
    System.out.println(b);
    

    StringBuilder sb3 = new StringBuilder(10);

    //size vs capacity
    // default capacity of StringBuilder is 16
    
    }
}
