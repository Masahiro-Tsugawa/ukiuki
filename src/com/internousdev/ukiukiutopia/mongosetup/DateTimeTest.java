package com.internousdev.ukiukiutopia.mongosetup;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class DateTimeTest {

	public static void main(String[] args) {
		
		DateTime dt = new DateTime();
		
		System.out.println(dt);
		System.out.println(dt.toCalendar(null));
		System.out.println(dt.toDate());
		System.out.println(dt.toLocalDate());
		System.out.println(dt.toLocalTime());
		System.out.println(dt.toString(DateTimeFormat.mediumDateTime()));
		System.out.println(dt.toString(DateTimeFormat.mediumDate()));
		System.out.println(dt.toString(DateTimeFormat.mediumTime()));
		
	}

}
