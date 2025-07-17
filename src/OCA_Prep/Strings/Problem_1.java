package OCA_Prep.Strings;

class Problem_1{

    public static void main(String[] args) {
        
    StringBuffer sb1= new StringBuffer("ANV");
    StringBuffer sb2= new StringBuffer("ANV");

    System.out.println(sb1==sb2);
    System.out.println(sb1.equals(sb2));

    // equals method returns false because StringBuffer does not override
    // equals methods for content comparison , it is used for reference comparsion

    }

}