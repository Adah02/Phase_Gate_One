import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class PersonalityTest {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("what is your name?");
	String yourName = input.nextLine();

	String[] a = { "Comfortable with walking to someone to start conversations", 
				"Little mistakes causes doubt in your abilities",
				"Prioritizes facts in the course of actions",
				 "Often compare efforts to others",
				"Very productive in team work", 
				"Not worried of making impressions", 
				"Not worried of things taking negative turns",
				"Base choices on objectives",
				"Loud and outgoing",
				"Authority over honesty",
				"Prioritizes proving points over feelings",
				"Logical and questioning",
				"Enjoy solitary hobbies and activities",
				"Work according to schedule",
				"Love eploring unfamiliar ideas & viewpoints",
				"Complete task before deadline",
				"A good listener & highly observant",
				"Do chores before relaxation",
				"Stay calm under pressure",
				"Not interested in discussions"
				};

	String[] b = {"Love being by yourself always", 
				"Not moved by past mistakes",
				"Allows feelings drive decision makings",
				"Not bothered by other's achievements",
				"Highly productive alone", 
				"Prioritizes making good impressions",
				"Worried for negative outcomes",
				"Do things based on emotional impressions",
				"Lonely and indoor lifestyle",
				"Honesty over other things",
				"Considers effects of decisions on others",
				"Empathical and accommodating",
				"Enjoy networking and promoting yourself around people",
				"Work without actual plan",
				"Work on pre-existing inventions",
				"Abandon complex tasks",
				"Not observant",
				"Allow things come in the way",
				"Highly unstable under pressure",
				"Overly interested in discussing with others"
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
			selections.add(optionA);
			options = false;
		} else if (choice.equalsIgnoreCase("b")){
			selections.add(optionB);
			options = false;
		} else {
				System.out.println("Enter a valid option");
				options = true;
				}
			}
		}

	}
}