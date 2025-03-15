import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dec_to_binary_count_consec_ones {
    
    public static void main(String[] args) throws IOException {
       
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        int count = 0;
        int max = 0;
        
        while(n>0){
            
            int a = n %2; //remainder
            
            if(a==1){
                count++;
                
                if(count > max){
                    max = count;
                }
            }else{
                count = 0 ;
            }
            
            n = n/2;
        }
        
        System.out.println(max);
        bufferedReader.close();
    }
}
