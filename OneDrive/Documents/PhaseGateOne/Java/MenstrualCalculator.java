import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
public class MenstrualCalculator {

	public static LocalDate nextMenstCycle(int menstMonth, int prevDay, int lengthOfFlow, int nextMenst){
	int currentYear = 2025;
	LocalDate today = LocalDate.of(currentYear, menstMonth, prevDay);
	int menstDay = nextMenst;
	int monthLength = today.lengthOfMonth();
	int remainingDays = (monthLength - prevDay);

	if (menstDay > remainingDays && menstMonth != 12){
		menstDay -= remainingDays; menstMonth += 1;
	}else if (menstMonth == 12 && menstDay > remainingDays){
		menstDay -= remainingDays; menstMonth = 1;
	}else{
		menstDay += prevDay;
		}
	int endPeriod = (menstDay + lengthOfFlow);
	if (endPeriod > remainingDays && menstDay < remainingDays){
			endPeriod -= remainingDays; menstMonth += 1;
		}
	System.out.printf("Next Menstruation is %d - %d of %d%n", menstDay, endPeriod, menstMonth);	
	return today;
	}

	public static long ovulationPeriod (int prevDay, int menstMonth){
	LocalDate today = LocalDate.of(2025, menstMonth, prevDay);
	int ovulation = prevDay + 14;
	int daysLeft = today.lengthOfMonth() - prevDay;
	if (ovulation > daysLeft){
		ovulation = 14 - daysLeft;
		menstMonth += 1;
		}	
	System.out.printf("The next ovulation is %d of %d%n", ovulation, menstMonth);
	return ovulation;
	}


	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Month of last Menstruation: ");
	int menstMonth = input.nextInt();

	System.out.print("Enter Day of last Menstruation: ");
	int prevDay = input.nextInt();
	
	System.out.print("Enter Length of flow in days: ");
	int lengthOfFlow = input.nextInt();
	
	System.out.print("Enter Days before next cycle: ");
	int nextMenst = input.nextInt();
	
	nextMenstCycle(menstMonth, prevDay, lengthOfFlow, nextMenst);
	ovulationPeriod (prevDay, menstMonth);
	}
}

