import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class PersonalityTest {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("what is your name?");
	String yourName = input.nextLine();

	String[] a = { "Comfortable with walking to someone to start conversations", 
				"Not moved by past mistakes",
				"Prioritizes facts in the course of actions",
				 "Often compare efforts to others",
				"Very productive in team work", 
				"Not worried of making impressions", 
				"Not worried of things taking negative turns",
				"Base choices on objectives",
				"Loud and outgoing",
				"Authority over honesty",
				"Prioritizes proving points over feelings",
				"Empathical and accommodating",
				"Enjoy networking and promoting yourself around people",
				"Work according to schedule",
				"Love eploring unfamiliar ideas & viewpoints",
				"Complete task before deadline",
				"Not observant",
				"Do chores before relaxation",
				"Highly unstable under pressure",
				"Overly interested in discussing with others"
				};

	String[] b = {"Love being by yourself always", 
				"Little mistakes causes doubt in your abilities",
				"Allows feelings drive decision makings",
				"Not bothered by other's achievements",
				"Highly productive alone", 
				"Prioritizes making good impressions",
				"Worried for negative outcomes",
				"Do things based on emotional impressions",
				"Lonely and indoor lifestyle",
				"Honesty over other things",
				"Considers effects of decisions on others",
				"Logical and questioning",
				"Enjoy solitary hobbies and activities",
				"Work without actual plan",
				"Work on pre-existing inventions",
				"Abandon complex tasks",
				"A good listener & highly observant",
				"Allow things come in the way",
				"Stay calm under pressure",
				"Not interested in discussions"
				};

	ArrayList<String> selections = new ArrayList<>();
	
	int introvert = 0;   int extrovert = 0; 		int sensing = 0;   int intuitive = 0;
	int thinking = 0; 	int feeling = 0;		int judging = 0;   int perception = 0;

	for (int index = 0; index < 20; index++){
		String optionA = (a[index]);	
		String optionB = (b[index]);
		
		boolean options = true;
		while (options == true){
		System.out.printf("(A) %s	(B) %s%nChoose option: ", optionA, optionB);
		String choice = input.next();

		if (choice.equalsIgnoreCase("a")){
			options = false;
		} else if (choice.equalsIgnoreCase("b")){
			options = false;
		} else {
				System.out.println("Enter a valid option");
				options = true;
				}
		if (optionA == (a[0])  && choice.equalsIgnoreCase("a") || optionA == (a[4])  && choice.equalsIgnoreCase("a") ||
		optionA == (a[8])  && choice.equalsIgnoreCase("a") || optionA == (a[12])  && choice.equalsIgnoreCase("a") || 
		optionA == (a[16])  && choice.equalsIgnoreCase("a")){  extrovert += 1  selections.add(optionA);;	
			} else { introvert += 1;  selections.add(optionB);}

		if (optionA == (a[1])  && choice.equalsIgnoreCase("a") || optionA == (a[5])  && choice.equalsIgnoreCase("a") ||
		optionA == (a[9])  && choice.equalsIgnoreCase("a") || optionA == (a[13])  && choice.equalsIgnoreCase("a") || 
		optionA == (a[17])  && choice.equalsIgnoreCase("a")){  intuitive += 1;	
			} else { sensing += 1;}

		if (optionA == (a[2])  && choice.equalsIgnoreCase("a") || optionA == (a[6])  && choice.equalsIgnoreCase("a") ||
		optionA == (a[10])  && choice.equalsIgnoreCase("a") || optionA == (a[14])  && choice.equalsIgnoreCase("a") || 
		optionA == (a[18])  && choice.equalsIgnoreCase("a")){  thinking += 1;	
			} else { feeling += 1;}

			if (optionA == (a[3])  && choice.equalsIgnoreCase("a") || optionA == (a[7])  && choice.equalsIgnoreCase("a") ||
		optionA == (a[11])  && choice.equalsIgnoreCase("a") || optionA == (a[15])  && choice.equalsIgnoreCase("a") || 
		optionA == (a[19])  && choice.equalsIgnoreCase("a")){  thinking += 1;	
			} else { feeling += 1;}

			}
		}

	}
}