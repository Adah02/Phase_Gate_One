import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
public class MenstrualCalculator {

	public static LocalDate nextMenstCycle(int mensMonth, int prevDay, int lengthOfFlow, int nextMenst){

	LocalDate today = LocalDate.of(2025, mensMonth, prevDay);

	int year = today.getYear();
	int month = today.getMonthValue();
	int day = today.getDayOfMonth();

	int menstDay = nextMenst + lengthOfFlow;
	int daysInMonth = today.lengthOfMonth();
	int remainingDays = (daysInMonth - prevDay);
	if (menstDay > remainingDays){
		menstDay -= remainingDays; mensMonth += 1;
	}
	else{
		menstDay += prevDay;
		}
	int endPeriod = (menstDay + lengthOfFlow);
	if (endPeriod > daysInMonth && menstDay < daysInMonth){
			endPeriod = endPeriod - remainingDays; mensMonth += 1;
		}
	
	System.out.printf("Next Menstruation is %d - %d of %d%n", menstDay, endPeriod, mensMonth);	
	System.out.printf("Days in current month %d%n", daysInMonth);
	
	return today;
	}

	

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Month of last Menstruation: ");
	int mensMonth = input.nextInt();

	System.out.print("Enter Day of last Menstruation: ");
	int prevDay = input.nextInt();
	
	System.out.print("Enter Length of flow in days: ");
	int lengthOfFlow = input.nextInt();
	
	System.out.print("Enter Days before next cycle: ");
	int nextMenst = input.nextInt();
	
	nextMenstCycle(mensMonth, prevDay, lengthOfFlow, nextMenst);
	}
}

