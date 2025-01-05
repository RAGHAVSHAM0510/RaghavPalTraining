package UtilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static String getYear() {
		return new SimpleDateFormat("yyyy").format(new Date());
	}

	public static String getMonthYear() {
		return new SimpleDateFormat("MMMyyyy").format(new Date());
	}

	public static String getDateMonthYear() {
		return new SimpleDateFormat("ddMMMyyyy").format(new Date());
	}

	public static String getDateTime() {
		return new SimpleDateFormat("ddMMMyyyy HHmmss").format(new Date());
	}

}
