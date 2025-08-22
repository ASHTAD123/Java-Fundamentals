package OCA_Prep.OOPS.Interitance;

public interface  FrogBoilable {
    
    static int getCtoF(int cTemp){
        return (cTemp * 9 / 5) + 32;
    }

    default String hop(){
        return "hopping from inteface default method";
    }
}

class DontBoilFrogs implements FrogBoilable{

    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }

    void go(){
        System.out.println(hop());//default methods of interface can be called in in sub-class
    }
}
