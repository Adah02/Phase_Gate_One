import java.util.Scanner;
import java.util.Arrays;
public class studentGrade {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	studentGradeFunctions quiz = new studentGradeFunctions();

	System.out.println("How many students do you have? : ");
	int students = input.nextInt();

	System.out.println("How many do they offer? : ");
	int subjects = input.nextInt();

	double[][] scores = new double[students][subjects];

	for (int index = 0; index < scores.length; index++){
		for (int count = 0; count < scores[index].length; count++){
			boolean validScore = true;
			while (validScore = true){
				System.out.printf("Enter score for student %d%n Subject %d : ", index + 1,  count + 1);
				double score = input.nextDouble();
				if (score >= 0 && score <= 100){
					scores[index][count] = score;
					validScore = false;
					break;
				} else {
					System.out.println("Enter a valid score between 0 and 100");
					 validScore = true;
					}
				}
			}
		}
		double[] studentTotal = new double[students];
	
		double[] studentAverage = new double[students];

		for (int index = 0; index < scores.length; index++){
			double total = 0; 
			System.out.printf("Student %d \t", (index + 1));
			for (int count = 0; count < scores[index].length; count++){
				total += scores[index][count];
			}
			studentTotal[index] = total; 
		studentAverage[index] = total / subjects;
		}

		
		
		for (int header = 0; header < 1; header++){
			System.out.print("\nSTUDENTS \t");
			for (int subj = 0; subj < subjects; subj++){
			System.out.printf("SUB%d \t", (subj + 1));
			}
		System.out.println("TOTAL \tAVERAGE\tPOSITION");
		}
		
		for (int index = 0; index < scores.length; index++){
			System.out.printf("Student %d \t", (index + 1));
			for (int count = 0; count < scores[index].length; count++){
				System.out.printf("%.0f \t", (scores[index][count]));
			}
		System.out.printf("%.0f \t%.1f", studentTotal[index], studentAverage[index]);
		System.out.println(" ");
		}

	}
}