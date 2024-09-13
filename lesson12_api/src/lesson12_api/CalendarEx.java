package lesson12_api;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

public class CalendarEx {
	public static void main(String[] args) {		
		Calendar cal = new GregorianCalendar();
//		Calendar cal2 = Calendar.getInstance();
		
		Date date = new Date(cal.getTimeInMillis());
		date.setTime(cal.getTimeInMillis());
		
		cal.setTimeInMillis(date.getTime());
		
//		cal.getActualMaximum(0) : 달의 마지막날 구할 수 있다
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(cal.get(YEAR));
		System.out.println(cal.get(ERA));
		System.out.println(cal.get(MONTH));
		System.out.println(cal.get(DATE));
		System.out.println(cal.get(DAY_OF_MONTH));
		System.out.println(cal.get(DAY_OF_WEEK));
		
		cal.set(DATE, 15);
		
		System.out.println(DAY_OF_WEEK);
		System.out.println(cal.get(DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(ZONE_OFFSET) / 1000 / 60 / 60);
		
		
	}
}
