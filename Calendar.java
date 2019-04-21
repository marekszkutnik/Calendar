import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		System.out.println("Pn  Wt  �r  Czw  Pt  Sob  Nd");
		
		while(date.getMonthValue() == month)
		{
			System.out.printf("%3d", date.getDayOfMonth());
			if(date.getDayOfMonth() == today) System.out.print("*");
			else System.out.print(" ");
			date = date.plusDays(1);
			if(date.getDayOfWeek().getValue() == 1) System.out.println();
		}
	}

}
