import java.time.LocalDate;
import java.time.Period;

/**
 * Create a method to accept date and print the duration in days, months and years with regards 
   to current system date.
 * @author :sri hari muppalla
 *
 */
public class Exercise9 {

	public static void main(String[] args) {
		LocalDate input=LocalDate.of(2019, 05, 01);
		durationDifference(input);

	}
	
	private static void durationDifference(LocalDate date) {
		LocalDate current=LocalDate.now();
		Period diff=Period.between(date, current);
		System.out.println("The difference is "+diff.getYears()+" year "+diff.getMonths()+" months "+diff.getDays()+" Days");
		
	}

}
