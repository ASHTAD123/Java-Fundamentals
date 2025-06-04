package OCA_Prep.Date_Time_API;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

        LocalTime times = LocalTime.of(5, 15);

        //Method chaining
        LocalDateTime dateTimes_1 = LocalDateTime.of(
                                    LocalDate.of(9999, 1,20),
                                    LocalTime.of(15,15))
                                    .minusDays(1).minusHours(10).minusSeconds(30);

                                    System.out.println(dateTimes_1);


      //Period
      Period period = Period.ofYears(1);
      Period customPeriod = Period.of(0, 1, 30);

      period.ofMonths(1).ofDays(0);//possible but will not work because methods are static

       performAnimalEnrichment( LocalDate.of(2015, Month.JANUARY, 1), LocalDate.of(2015, Month.MARCH, 30),customPeriod);


       //Duration
       Duration minutes = Duration.ofMinutes(10);
       minutes.plus(minutes);

       //formatting dates nd time
       System.out.println("Days of month : " + dates.getDayOfMonth());
       System.out.println("Days of week : " +dates.getDayOfWeek());
       System.out.println("Days of year : " +dates.getDayOfYear());

      //Date Time Formatter
      DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
      System.out.println(shortDateTime.format(dateTime_1));
      System.out.println(shortDateTime.format(dates));//dates
      // System.out.println(shortDateTime.format(times));  //java.time.temporal.UnsupportedTemporalTypeException

      System.out.println(dateTime_1.format(shortDateTime));

    }

    
      static void performAnimalEnrichment(LocalDate start,LocalDate end,Period period){

        LocalDate upto = start;

        while(upto.isBefore(end)){
          System.out.println("Give new toy : " +upto);
          upto = upto.plus(period);
        }
      }
}
