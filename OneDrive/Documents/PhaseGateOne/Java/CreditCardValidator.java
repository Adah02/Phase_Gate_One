public class CreditCardValidator {

	public static String cardValidity(String cardNumber){
	boolean cardValid = false;
		if (cardNumber.charAt(0) > '2' && cardNumber.charAt(0) < '7'){
			if (cardNumber.length() >= 13 && cardNumber.length() <= 16){
				if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) != '7'){
				cardValid = false;
				}else {
				cardValid = true;
				}
			}else {
				cardValid = false;
				}
		} else {
			cardValid = false;
			}
	String validity = (cardValid) ? "Valid" : "Invalid";
	return validity;
	}

	public static String validityStatus(String cardNumber){
	int sum = 0;  int sumOdd = 0;
	for (int index = cardNumber.length() - 1; index >= 0; index--){
		sumOdd = Integer.valueOf(cardNumber.charAt(index));

		index -= 1;
		int integerValue = Integer.valueOf(cardNumber.charAt(index)) * 2;
			if (integerValue > 9){
				int firstDigit = integerValue / 10;  int secondDigit =  integerValue % 10;
				sum += (firstDigit + secondDigit);	
			} else{
				sum += integerValue;
			}
		}
	int total = sum + sumOdd;
	String validator = (total / 10 == 0) ? "Valid" : "Invalid";
	return validator;
	}	
}