const prompt = require("prompt-sync")()

	let students = prompt("How many students do you have? : ");

	let subjects = prompt("How many do they offer? : ");

	let scores = [][];

	for (int index = 0; index < scores.length; index++){
		for (let count = 0; count < scores[index].length; count++){
			let validScore = true;
			while (validScore = true){
				let score = prompt("Enter score for student ${index + 1} \n Subject ${count + 1} : ");
				if (score >= 0 && score <= 100){
					scores[index][count] = score;
					validScore = false;    break;
				} else {
					console.log("Enter a valid score between 0 and 100");
					 validScore = true;
					}
				}
			}
		}
		let studentTotal = new double[students];
		let studentAverage = new double[students];

		let sortedScores = [];
		let positions = [];

		for (let index = 0; index < scores.length; index++){
			double total = 0; 
			for (let count = 0; count < scores[index].length; count++){
				total += scores[index][count];
			}
			studentTotal[index] = total; 
		studentAverage[index] = total / subjects;
		}	

		for (let header = 0; header < 1; header++){
			console.log("\nSTUDENTS \t");
			for (let subj = 0; subj < subjects; subj++){
			console.log("SUB ${subj + 1} \t");
			}
		console.log("TOTAL \tAVERAGE\tPOSITION");
		}

		let studentScoreTotal = [];
		
		for (let sorted = 0; sorted < students; sorted++){
			studentScoreTotal[sorted] = studentTotal[sorted];
		}
		Arrays.sort(studentScoreTotal);
		for (let sorted = 0; sorted < students; sorted++){
			sortedScores[sorted] = studentScoreTotal[sorted];
		}

		let position = 1;
		for (let  index = students - 1; index >= 0; index--){
			for (let count = 0; count < students; count++){
			if (sortedScores[index] == studentTotal[count] && index > 0 && sortedScores[index] == sortedScores[index - 1]){
				positions[count] = position - 1;  
				position += 1;
				break;
				}  else if (sortedScores[index] == studentTotal[count]){
					positions[count] = position;  
					position += 1;
					break;
				}
			}
		} 

		for (let index = 0; index < scores.length; index++){
			console.log("Student ",(index + 1),"\t");
			for (let count = 0; count < scores[index].length; count++){
				console.log(scores[index][count],"\t");
			}
		System.out.printf("%.0f \t%.1f \t%d%n", studentTotal[index], studentAverage[index], positions[index]);
		}

		System.out.println("\n \t SUBJECT SUMMARY");
		
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
		System.out.printf("Highest scoring student is :  Student %d  scoring %.0f%n", highestStudent, highestScore);
		System.out.printf("Lowest scoring student is :  Student %d  scoring %.0f%n", lowestStudent, LowestScore);
		System.out.printf("Total score is: %.0f%nThe average score is: %.2f%n", total, (total / subjects));
		System.out.printf("Number of passes %d%nNumber of fails %d%n", pass, fail);
		System.out.println("");
		}
	}
}