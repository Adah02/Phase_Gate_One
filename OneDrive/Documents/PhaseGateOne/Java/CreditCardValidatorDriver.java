import java.util.Scanner;
public class CreditCardValidatorDriver {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	CreditCardValidator quiz = new CreditCardValidator();

	System.out.print("Enter card number to verify: ");
	String cardNumber = input.nextLine();

	quiz.cardValidity(cardNumber);
	quiz.validityStatus(cardNumber);

	System.out.println(quiz.cardValidity(cardNumber));
	System.out.println(quiz.validityStatus(cardNumber));
	}
}