import java.util.Scanner;

public class GasMileages {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter miles driven. type -1 to stop: ");
	double milesDriven = input.nextDouble();

	System.out.print("Enter gallons used: ");
	double gallonsUsed = input.nextDouble();

	int counter = 1;
	double milesPerGal = 0;

	while (milesDriven != -1){
	double milesPerGallon = milesDriven / gallonsUsed;
	
	System.out.print("Enter miles driven. type -1 to stop: ");
	milesDriven = input.nextDouble();
	System.out.print("Enter gallons used: ");
	gallonsUsed = input.nextDouble();
	}
	System.out.print(counter + " " + "Mile per Gallon " + milesPerGal);
	}
}