const prompt = require("prompt-sync")()

	System.out.println("How many students do you have? : ");
	int students = input.nextInt();

	System.out.println("How many do they offer? : ");
	int subjects = input.nextInt();

	let scores = [students][subjects];

	for (let index = 0; index < scores.length; index++){
		for (let count = 0; count < scores[index].length; count++){
			let validScore = true;
			while (validScore = true){
				let score = prompt("Enter score for student", ( index + 1), \n,"Subject ${count + 1}: ");
				if (score >= 0 && score <= 100){
					scores[index][count] = score;
					validScore = false;    break;
				} else {
					System.out.println("Enter a valid score between 0 and 100");
					 validScore = true;
					}
				}
			}
		};
		let studentTotal = [];
		let studentAverage = [];

		let sortedScores = [];
		let positions = [];

		int counter = 0;
		for (int count =2000; count >= 0; count--){
			for (int index = 0; index < students; index++){
				if (studentTotal[index] == count){
					sortedScores[counter] = studentTotal[index];
					counter += 1;
				} break;
			}
		}
/*
		int position = 1;
		for (int sorted = 0; sorted < students; sorted++){
			for (int index = 0; index < students; index++){
				if (sortedScores[sorted] == studentTotal[index]){
					positions[index] = position;  
					position += 1;
					break;
				} 
  	else if (sortedScores[sorted] == studentTotal[index] && sorted > 1 && sortedScores[sorted] == sortedScores[sorted - 1]){
					positions[index] = position - 1;
					position += 1;
					break;
					} else {	positions[index] = position;
							position += 1;
							break;
							}
				}
			}
*/
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
		System.out.printf("%.0f \t%.1f \t%f%n", studentTotal[index], studentAverage[index], sortedScores[index]);
		}

		System.out.println("\n SUBJECT SUMMARY");
		
		for (int subj = 0; subj < scores[0].length; subj++){
			System.out.println("Subject " + (subj + 1));
			double total = 0;    double highestScore = 0;	int highestStudent = 0; 
			double LowestScore = Integer.MAX_VALUE;	int lowestStudent = 0;  int pass = 0;   int fail = 0;
			for (int score = 0; score < scores.length; score++){
			if (scores[score][subj] > highestScore) {
				highestScore = scores[score][subj];
				highestStudent = score + 1;
				}
			if (scores[score][subj] < LowestScore) {
				LowestScore = scores[score][subj];
				lowestStudent = score + 1;
				}
			if (scores[score][subj] > 39){
				pass += 1;
			} else {	fail += 1;
				}
			total += scores[score][subj];
			}
		console.log("Highest scoring student is :  Student %d  scoring %.0f%n", highestStudent, highestScore);
		console.log("Lowest scoring student is :  Student %d  scoring %.0f%n", lowestStudent, LowestScore);
		console.log("Total score is: %.0f%nThe average score is: %.2f%n", total, (total / subjects));
		console.log("Number of passes %d%nNumber of fails %d%n", pass, fail);
		console.log("");
		}

	}
}