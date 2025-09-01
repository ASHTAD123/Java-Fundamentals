package OCA_Prep.Operators;
public class TernaryOp {
    
    public static void main(String[] args) {
        
        int sizeOfYard =10;
        int numberOfPets = 3;

        String status = (numberOfPets > 5 ) ? "Pet count OK" : (sizeOfYard < 8) ? "pet limit on the edge" :"too many pets";
        System.out.println(status);
    }
}
