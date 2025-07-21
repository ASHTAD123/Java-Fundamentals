package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_2 {
    
    String name;
    int rollno;

    Problem_2(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Problem_2  s){

        if(s.name.equals(this.name) && s.rollno ==this.rollno){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        Problem_2 p1= new Problem_2("AS",101); 
        Problem_2 p2= new Problem_2("ASH",102); 
        Problem_2 p3= new Problem_2("AS",101); 

        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println(p1.equals(p2));//false
        System.out.println(p1.equals(p3));//true

       //here we have our own .equals() from which compares content 
    }
}
