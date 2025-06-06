import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
public class MenstrualCalculator {

	public static LocalDate nextMenstCycle(int mensMonth, int prevDay, int mensFlow, int nextMenst){

	LocalDate today = LocalDate.of(2025, mensMonth, prevDay);

	int year = today.getYear();
	int month = today.getMonthValue();
	int day = today.getDayOfMonth();

	int menstDay = (day - prevDay) + nextMenst + mensFlow;
	if (menstDay > today.getMonth().maxLength()){
		month += 1;
		System.out.printf("Next Menstruation is %d - %d %d%n", menstDay, (menstDay +mensFlow), month);
	}
	return today;
	}

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter month of last period: ");
	int mensMonth = input.nextInt();

	System.out.print("Enter day of last period: ");
	int prevDay = input.nextInt();
	
	System.out.print("Enter length of flow in days: ");
	int mensFlow = input.nextInt();
	
	System.out.print("Enter days before next cycle: ");
	int nextMenst = input.nextInt();

	System.out.print(nextMenstCycle(mensMonth, prevDay, mensFlow, nextMenst));
	
	}
}

