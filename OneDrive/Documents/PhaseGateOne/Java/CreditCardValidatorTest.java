import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CreditCardValidatorTest {

	CreditCardValidator quiz = new CreditCardValidator();

	@Test
	public void checkForCardValidity() {

	String check = "4773437473784656";
	String expected = "Valid";

	assertEquals(expected, quiz.cardValidity(check));
	}

	@Test
	public void checkIfCardNumberIsTheSame() {

	String check = "4388 5760 1841 0707";
	String expected = "4388576018410707";

	assertEquals(expected, quiz.myCardNumber(check));
	}

	@Test
	public void checkForValidCardNumberValidityStatus() {

	String check = "4388 5760 1841 0707";
	String expected = "Valid";

	assertEquals(expected, quiz.validityStatus(check));
	}



	@Test
	public void checkForCardNumberLength() {

	String check = "477343747378465";
	int expected = 15;

	assertEquals(expected, quiz.cardNumberLength(check));
	}

}