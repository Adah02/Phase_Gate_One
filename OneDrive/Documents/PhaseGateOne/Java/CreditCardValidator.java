import java.util.Scanner;
public class CreditCardValidator {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	boolean cardValid = false;
	while (cardValid == false){
	System.out.print("Enter card number: ");
	String cardNumber = input.nextLine();

	if (cardNumber.charAt(0) > '2' && cardNumber.charAt(0) < '7'){
		if (cardNumber.length() >= 13 && cardNumber.length() <= 16){
			cardValid = true;
		}
		else{
			System.out.println("Invalid card number");
			cardValid = false;
		}
	} else {
		System.out.println("Invalid card number");
		cardValid = false;
		}
	}

	}
}