package OCA_Prep.Encapsulation;

public class Student {
    
    private int marks;

    int getMarks(){
        return this.marks;
    }

    void setMarks(int marks){

        if(marks>=0 && marks <=100){
            this.marks = marks;
        }else{
            System.out.println("Please enter a valid marks");
        }
    }

    public static void main(String[] args) {
        
    }
}
