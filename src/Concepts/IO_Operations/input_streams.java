package Concepts.IO_Operations;

import java.util.Date;

public class input_streams {

	public static void main(String[] args) {
		
		
		int a=10;
		float b=10f;
		boolean boo=true;
		char c= 'a';
		String s ="Ash";
		Date time = new Date();
		
		System.out.print("example of printn --- ");
		System.out.print("example of printn 1");
		System.out.println(" --- this comes on same line because cursor is on print statement ");
		System.out.println("example of println comes on next line ");
	
		//decimal number formatting
		System.out.printf("printf can print multiple arguments & also append characters a=%d",a);
		System.out.println("");
		
		//float formatting
		System.out.printf("printf b=%f",b); 
		
		//boolean formatting
		System.out.printf("\n%b", boo);
		System.out.printf("\n%B", boo);
		
		//char formatting
		System.out.printf("\n%c",c);
		System.out.printf("\n%C",c);
	
		//string formatting
		System.out.printf("\n%s",s);
		System.out.printf("\n%S",s);
	
		//date formatting
		System.out.printf("\nCurrent Time: %tT\n", time);

        // Another Method with all of them Hour
        // minutes and seconds seperated
//        System.out.printf("Hours: %tH  Minutes: %tM Seconds: %tS\n", 
//        		date,date, date);
//
//        // Another Method to print the time
//        // Followed by am/pm , time in milliseconds
//        // nanoseconds and time-zone offset
//        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n",
//        		date);
	
	
	}
}
