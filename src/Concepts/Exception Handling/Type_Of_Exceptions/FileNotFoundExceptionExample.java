package Type_Of_Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    
    public static void main(String[] args) {
        
        try{
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
        }catch(FileNotFoundException e){
            System.out.println("File does not exist ");
        }
    }
}
