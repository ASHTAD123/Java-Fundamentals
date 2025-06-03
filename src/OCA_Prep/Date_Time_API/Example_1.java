package OCA_Prep.Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Example_1 {
    
    public static void main(String[] args) {
        
        //cannot create any localdate object with new keyword
        // because it has private constructor
        //LocalDate d = new LocalDate()

        System.out.println("Local Date : " +LocalDate.now());
        System.out.println("Local Time : " +LocalTime.now());
        System.out.println("Local Date & Time : " +LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2025, 1, 5);
        LocalDate date2 = LocalDate.of(2025, Month.APRIL,1);

        System.out.println(date1);
        System.out.println(date2);

        //hr , min
        LocalTime time_1 = LocalTime.of(6,20);

        //hr,mins,secs
        LocalTime time_2 = LocalTime.of(5,20,30);

        LocalTime time_3 = LocalTime.of(6, 20,59,9990);

        System.out.println(time_1);
        System.out.println(time_2);
        System.out.println(time_3);

        LocalDateTime dateTime_1 = LocalDateTime.of(2023, Month.APRIL,20,20,44);
        System.out.println(dateTime_1);

        LocalDateTime dateTime_2 = LocalDateTime.of(date2, time_3);
        System.out.println(dateTime_2);

        //DateTimeException
      //  System.out.println(LocalDate.of(99999999, 0, 2));

        //Manipulation of Date and Time
        LocalDate dates = LocalDate.of(2031, Month.DECEMBER,20);
        System.out.println(dates);
        System.out.println(dates.plusDays(2));
        System.out.println(dates);
        System.out.println(dates.plusWeeks(5));

        LocalTime times = LocalTime.of(5, 15f);













    }
}
