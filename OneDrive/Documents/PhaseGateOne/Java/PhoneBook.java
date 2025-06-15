import java.util.Scanner;
public class PhoneBook {

	public static ArrayList<String> nameCollections (name){

		ArrayList<String> names = new ArrayList<>();
		
		names.add(name);

		return names;
	}

	public static void main(String[] main){

	Scanner input = new Scanner(System.in);

	System.out.print("Welcome to Ultimate Phonebook... \n A place for ");

	String activities = """
			Press ;-
			1 > Add contact
			2 > Remove contact
			3 > Find contact
			4 > Edit contact
			""";

		boolean activity = true;
		while (activity == true){
		System.out.print(activities);
		System.out.print("Kindly enter your choice: ");
		int usersChoice = input.nextInt();

		switch(usersChoice){
			case 1:{
					System.out.println("Enter name: ");
					
					System.out.println("Enter address: ");
					System.out.println("Enter telephone No: ");
					System.out.println("Enter email: ");

				}
			}

		}


	}
}