import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
public class MenstrualCalculator {

	public static Date gettingDateOf () {

	Calendar calendar = Calendar.getInstance();

	calendar.set(Calendar.YEAR, 2025);
	calendar.set(Calendar.MONTH, Calendar.JUNE);
	calendar.set(Calendar.DAY_OF_MONTH, 6);

	Date date = calendar.getTime();

	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);
	int day = calendar.get(Calendar.DAY_OF_MONTH);

	System.out.printf("%d/%d/%d%n",year, month, day);
	return date;
	}


	public static void main(String[] args){

	Scanner input =  new Scanner(System.in);

	gettingDateOf ();
	}

}