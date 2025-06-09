import java.util.Scanner;
public class CreditCardValidatorDriver {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	CreditCardValidator quiz = new CreditCardValidator();

	System.out.print("Enter card number to verify: ");
	String cardNumbers = input.nextLine();

	String cardNumber = cardNumbers.replaceAll("\\s+", "");

	quiz.cardValidity(cardNumber);
	quiz.validityStatus(cardNumber);

	for (int index = 0; index < 42; index++){ System.out.print("*"); } System.out.println();
	System.out.println("** Credit Card Type: " + quiz.creditCardType(cardNumber));
	System.out.println("** Credit Card Number: " + quiz.myCardNumber(cardNumber));
	System.out.println("** Credit Card Digit Length: " + quiz.cardNumberLength(cardNumber));
	System.out.println("** Credit Card Validity Status: " + quiz.validityStatus(cardNumber));
	for (int index = 0; index < 42; index++){ System.out.print("*"); } System.out.println();
	}
}