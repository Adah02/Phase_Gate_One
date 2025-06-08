import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CreditCardValidatorTest {

	CreditCardValidator quiz = new CreditCardValidator();

	@Test
	public void checkForCardStatusValidity() {

	String check = "4773437473784656";
	String expected = "Valid";

	assertEquals(expected, quiz.cardValidity(check));
	}

	@Test
	public void checkForCardNumberLength() {

	String check = "477343747378465";
	int expected = 15;

	assertEquals(expected, quiz.cardNumberLength(check));
	}

}