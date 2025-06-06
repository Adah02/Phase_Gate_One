import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class MenstrualCalculatorTest {

	MenstrualCalculator quiz = new MenstrualCalculator();

	@Test
	public void calculatorCheckForDateOfPreviousFlow(){

	int day = 6;
	int month = 5;
	long expected = 2025-05-06;
	
	assertEquals(expected, quiz.previousFlowDate(day, month));
	}

}