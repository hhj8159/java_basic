package lesson12_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.*;
import static java.time.temporal.TemporalAdjusters.*;

public class ExerCalendar {

	// 1번 과제
	// 달력 출력 (최소 이번달)
	// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력시 해당 연월 달력 출력
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		// 풀이
		Calendar cal = Calendar.getInstance(); // 2024 9 1
		cal.set(Calendar.DATE, 1); // 1 = 한달추가 -1=한달마이너스
		printCal(cal);
		while (true) {
			System.out.println("1 .이전달 2. 다음달 3. 이전해 4. 다음해 5. 달 지정(검색)");
			switch (Integer.parseInt(scanner.nextInt())) {
			case 1:
				cal.add(Calendar.MONTH, -1); // 1 = 한달추가 -1=한달마이너스
				break;
			case 2:
				cal.add(Calendar.MONTH, 1);
				break;
			case 3:
				cal.add(Calendar.YEAR, -1);
				break;
			case 4:
				cal.add(Calendar.YEAR, 1);
				break;
			case 5:
//				System.out.println("연도 입력 > ");
//				cal.set(Calendar.YEAR, scanner.nextInt());
//				System.out.println("월 입력 > ");
//				cal.set(Calendar.MONTH, scanner.nextInt()-1);
				System.out.println("연도, 월을 입력해주세요 ex) 2024/09 > ");
				String str = scanner.nextLine();
				cal.setTime(new SimpleDateFormat("yyyy/MM").parse(str));  
				break;
				
			default:
				break;
			}
			printCal(cal);
		}
		// 연, 월, 마지막날짜, 1일의 요일
			
		
	}	
	static void printCal(Calendar cal) {
		String year = cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH) + 1);
//			int month = cal.get(Calendar.MONTH); // 8
//			System.out.println(year);
//			System.out.println(month);
			int lastDate = cal.getActualMaximum(Calendar.DATE);
//			System.out.println(lastDate);
		cal.set(Calendar.DATE, 1);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);
		
		for(int i = 1 - startDay + 1 ; i <= lastDate ; i++) {
//			System.out.printf("%4d", i);
			if(i > 0) {
				System.out.printf("%4d", i);
			}
			else {
				System.out.println("    ");
			}
			if(i % 7 == (7 - startDay + 1) % 7) {
				System.out.println();
			}
		}
	}
}