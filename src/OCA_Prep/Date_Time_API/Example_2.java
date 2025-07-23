package OCA_Prep.Date_Time_API;
import java.time.*;

public class Example_2 {
    
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.now();
        int dd = localDate.getDayOfMonth();
        int mm = localDate.getMonthValue();
        int yy = localDate.getYear();
        System.out.printf("%d/%d/%d", dd,mm,yy);
        System.out.println();
        System.out.printf("%d-%d-%d", dd,mm,yy);
    }

}
