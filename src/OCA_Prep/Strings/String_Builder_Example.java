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

    }
}
