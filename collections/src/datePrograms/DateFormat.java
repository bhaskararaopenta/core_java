package datePrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d);

		// to convert as per our requirement
		String pattern = "YYYY-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String d2 = sdf.format(d); // it will convert the Date into given pattern format return in
		System.out.println(d2);

		// convert back to normal type date format

		Date d3 = sdf.parse(d2); // converting string format of date into Date class format
		System.out.println(d3);

	}

}
