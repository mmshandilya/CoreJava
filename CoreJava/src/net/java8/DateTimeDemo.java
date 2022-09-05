package net.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {

		LocalDate d=LocalDate.now();
		//LocalDate d=LocalDate.of(1982, Month.JULY, 23);
		System.out.println(d);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalTime t=LocalTime.now(ZoneId.of("Europe/Belfast"));
		System.out.println(t);
		
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
