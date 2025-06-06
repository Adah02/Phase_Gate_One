import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
public class MenstrualCalculator {

	public static void main(String[] args){

	LocalDate today = LocalDate.now();

	int year = today.getYear();
	int month = today.getMonthValue();
	int day = today.getDayOfMonth();


	System.out.printf("%d %d %d%n", day, month, year);
	
	}
	
/*
	public static void main(String[] args){

	Scanner input =  new Scanner(System.in);

	System.out.print(gettingDateOf());

	}
*/
}

