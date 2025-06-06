import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;
public class MenstrualCalculator {

	
	
	public static LocalDate previousFlowDate(int menstMonth, int prevDay){
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	LocalDate flowDate = LocalDate.of(year, menstMonth, prevDay);

	return flowDate;
	}

	public static LocalDate nextMenstCycle(int menstMonth, int prevDay, int nextMenst){
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	LocalDate flowDate = LocalDate.of(year, menstMonth, prevDay);
	int menstDay = nextMenst;
	int monthLength = flowDate.lengthOfMonth();
	int remainingDays = (monthLength - prevDay);

	if (menstDay > remainingDays && menstMonth != 12){
		menstDay -= remainingDays; menstMonth += 1;
	}else if (menstMonth == 12 && menstDay > remainingDays){
		menstDay -= remainingDays; menstMonth = 1; year += 1;
	}else{
		menstDay += prevDay;
		}
	LocalDate nextMenstruation = LocalDate.of(year, menstMonth, menstDay);
	return nextMenstruation;
	}

	public static LocalDate ovulationPeriod (int prevDay, int menstMonth){
	
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	LocalDate today = LocalDate.of(year, menstMonth, prevDay);
	int ovulationDay = prevDay + 14;
	int daysLeft = today.lengthOfMonth() - prevDay;

	if (ovulationDay > daysLeft){
		ovulationDay = 14 - daysLeft;
		menstMonth += 1;
		}
		else if (ovulationDay > daysLeft && menstMonth == 12){
		ovulationDay = 14 - daysLeft;
		menstMonth = 1;
		year += 1;
		}
	LocalDate ovulationDate = LocalDate.of(year, menstMonth, ovulationDay);
	return ovulationDate;
	}


	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Month of last Menstruation: ");
	int menstMonth = input.nextInt();

	System.out.print("Enter Day of last Menstruation: ");
	int prevDay = input.nextInt();
	
	System.out.print("Enter Days before next cycle: ");
	int nextMenst = input.nextInt();
	
	System.out.println();
	System.out.println("Date of previous flow is " + previousFlowDate(menstMonth, prevDay));
	System.out.println("Next ovulation is " + ovulationPeriod (prevDay, menstMonth));
	System.out.println("Date of next menstruation is " + nextMenstCycle(menstMonth, prevDay, nextMenst));
	}
}

