package day30_DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class C06_LocalDTSoru {

	public static void main(String[] args) {
		/*   Which of the following can be inserted into the blank to create
		 * a date of June 21, 2014?
		 
        A. new LocalDate(2014, 5, 21);
        B. new LocalDate(2014, 6, 21);
        C. LocalDate.of(2014, 5, 21);
        D. LocalDate.of(2014, 6, 21);
        E. LocalDate.of(2014, Calendar.JUNE, 21);
        F. LocalDate.of(2014, Month.JUNE, 21);           
      */
 
		LocalDate date=LocalDate.of(2014, 6, 21);
		System.out.println(date);
		LocalDate date1=LocalDate.of(2014, Calendar.JUNE, 21);
	    System.out.println(date1);
	}

}
