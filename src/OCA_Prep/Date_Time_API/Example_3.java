package OCA_Prep.Date_Time_API;

import java.time.LocalTime;

public class Example_3 {
    
    public static void main(String[] args) {
        
        LocalTime localTime = LocalTime.now();
        int hh = localTime.getHour();
        int mins = localTime.getMinute();
        int secs = localTime.getSecond();

        System.out.printf("%d:%d:%d",hh,mins,secs);
    }
}
