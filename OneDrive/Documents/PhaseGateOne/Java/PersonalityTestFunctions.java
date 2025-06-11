import java.util.ArrayList;
public class PersonalityTestFunctions {

	public static String personalityType(int introvert,  int extrovert, int sensing, int intuitive, int thinking, int feeling, int judging, int perception){
	
	String personality = "";

		String energy = (introvert > extrovert) ? (personality += "I") : (personality += "E");
		String mind = (sensing > intuitive) ? (personality += "S") : (personality += "N");
		String nature = (thinking > feeling) ? (personality += "T") : (personality += "F");
		String tactics = (judging > perception) ? (personality += "J") : (personality += "P");
	 
	return personality;
	}

	public static String energyDetails(ArrayList<String> energy, int introvert, int extrovert){
		
		String choicesInEnergy = "";

		for (String item : energy){
		choicesInEnergy += String.format("%s%n", item);
		}
		choicesInEnergy += String.format("Number of A selected: %d%nNumber of B selected: %d%n", extrovert, introvert);
	return choicesInEnergy;
	}

	public static String mindDetails(ArrayList<String> mind, int sensing, int intuitive){
		
		String choicesInMind = "";

		for (String item : mind){
		choicesInMind += String.format("%s%n", item);
		}
		choicesInMind += String.format("Number of A selected: %d%nNumber of B selected: %d%n", intuitive, sensing);
	return choicesInMind;
	}

	public static String natureDetails(ArrayList<String> nature, int thinking, int feeling){
		
		String choicesInNature = "";

		for (String item : nature){
		choicesInNature += String.format("%s%n", item);
		}
		choicesInNature += String.format("Number of A selected: %d%nNumber of B selected: %d%n", thinking, feeling);
	return choicesInNature;
	}

	public static String tacticsDetails(ArrayList<String> tactics, int judging, int perception){
		
		String choicesInTactics = "";

		for (String item : tactics){
		choicesInTactics += String.format("%s%n", item);
		}
		choicesInTactics += String.format("Number of A selected: %d%nNumber of B selected: %d%n", judging, perception);
	return choicesInTactics;
	}

	public static String usersName(String myName){

	String refinedName = "";
	
	for (int index = 0; index < myName.length(); index++){

		if (myName.charAt(index) >= 'a' && myName.charAt(index) <= 'z' && myName.charAt(index) != ' ' || 
		myName.charAt(index) >= 'A' && myName.charAt(index) <= 'Z' && myName.charAt(index) != ' '){
				refinedName += myName.charAt(index);
			} else { myName.replaceAll(String.valueOf(myName.charAt(index)), "");  }
		}
	return refinedName;
	}


}

