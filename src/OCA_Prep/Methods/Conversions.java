package OCA_Prep.Methods;

public class Conversions {
    
    public static void play(Long l){

    }

    //doesn't match if only this and above methods are there
    public static void play(Long... l){

    }
    
    public static void play(Object  o){

    }
    public static void main(String[] args) {
        
        play(4);
        play(4L);
    }
}
