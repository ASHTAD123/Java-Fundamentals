package OCA_Prep.Date_Time_API;
import java.time.*;

public class Example_4 {

    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.of(2000,9,17,6,25);
        System.out.println(localDateTime.plusMonths(-11));
        System.out.println(localDateTime.plusMonths(10));

    }
}
