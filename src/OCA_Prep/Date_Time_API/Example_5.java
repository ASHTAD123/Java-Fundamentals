package OCA_Prep.Date_Time_API;
import java.time.*;

public class Example_5 {

    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 9, 17);
        Period p = Period.between(birthday, today);

        System.out.printf(" Age is %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
    }
}
