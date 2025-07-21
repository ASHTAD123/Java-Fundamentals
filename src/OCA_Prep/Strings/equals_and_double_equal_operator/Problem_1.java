package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_1 {
    
    String name;
    int rollno;

    Problem_1(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        
        Problem_1 p1= new Problem_1("AS",101); 
        Problem_1 p2= new Problem_1("ASH",102); 
        Problem_1 p3= new Problem_1("AS",103); 

        System.out.println(p1==p2);//false
        System.out.println(p1==p3);//false
        System.out.println(p1.equals(p2));//false
        System.out.println(p1.equals(p3));//false

        //last line is false because our class doesn't extend .equals method
        //so it uses object class's .equals() which is compares references not values
        //highly recommended to use our own .equals() in our class for content comparision
    }
}
