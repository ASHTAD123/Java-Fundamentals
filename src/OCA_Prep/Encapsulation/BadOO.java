package OCA_Prep.Encapsulation;

public class BadOO {
     
    private int size;
    private int weight;

    public static void main(String[] args) {
    
        BadOO badoo = new BadOO();
        badoo.size=0;
    }

    public void setSize(int size){

        if(size>100){
            this.size =size;
        }
    }

    public int getSize(){

        return size;
    }
}
