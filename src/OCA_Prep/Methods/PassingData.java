package OCA_Prep.Methods;

class PassingData{

public static void main(String[] args) {
    
    int x=5;
    change(x);
    System.out.println(x);//pass by value

    String webby="Webby";
    stringChange(webby);
    System.out.println(webby);

    webby = stringChange1(webby);
    System.out.println(webby);

    //pass by value ,even if it changes the object
    // a new copy of reference is created which modifies the original obj in the heap
    StringBuilder sb = new StringBuilder("aakash");
    stringChangeStringBuilder(sb);
    System.out.println(sb);

    int number =1 ;
    String letters ="Avav";

    // number = number(number);
    number(number);

    letters = letters(letters);
    System.out.println(number + letters);




}

    static int number(int num){
        num++;
        return num;
    }

    static String letters(String letters){
        letters += "d";
        return letters;
    }

    static void change(int num){
        num=10;
    }

    static void stringChange(String webby){
        webby = "Bird";
    }
   
    static String stringChange1(String webby){
        webby = "Bird";
        return webby;
    }

    static void stringChangeStringBuilder(StringBuilder webby){
        webby.append("webs");    
    }


}