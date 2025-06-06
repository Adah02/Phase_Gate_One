import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualCalculatorTest {

	MenstrualCalculator quiz = new MenstrualCalculator();

	@Test
	public void calculatorCheckForMonth(){

	int menstMonth = 5; int prevDay = 5; int lengthOfFlow = 3; int menstCycleLength = 27;
	int check = quiz.nextMenstCycle(menstMonth, prevDay, lengthOfFlow, menstCycleLength)
	
	}

}