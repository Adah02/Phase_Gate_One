const prompt = require("prompt-sync")()

	let students = prompt("How many students do you have? : ");

	let subjects = prompt("How many do they offer? : ");

	let scores = [[],[]];

	for (let index = 0; index < scores.length; index++){
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
		let studentTotal = [];
		let studentAverage = [];

		let sortedScores = [];
		let positions = [];

		for (let index = 0; index < scores.length; index++){
			let total = 0; 
			for (let count = 0; count < scores[index].length; count++){
				total += scores[index][count];
			}
			studentTotal[index] = total; 
		studentAverage[index] = total / subjects;
		}	

		for (let header = 0; header < 1; header++){
			let printSub = "";
			for (let subj = 0; subj < subjects; subj++){
				printSub += "SUB",(subj + 1),"\t";
			}
		console.log("STUDENTS \t",printSub,"TOTAL \tAVERAGE\tPOSITION");
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
			console.log(`Student ${index + 1}\t`);
			for (let count = 0; count < scores[index].length; count++){
				console.log(scores[index][count],"\t");
			}
		console.log(`${studentTotal[index]} \t ${studentAverage[index]} \t ${positions[index]}\n`);
		}

		console.log("\n \t SUBJECT SUMMARY");
		
		for (let subj = 0; subj < scores[0].length; subj++){
			System.out.println("Subject " + (subj + 1));
			let total = 0;    let highestScore = 0;	let highestStudent = 0; 
			let LowestScore = Integer.MAX_VALUE;	let lowestStudent = 0;  let pass = 0;   let fail = 0;
			for (let score = 0; score < scores.length; score++){
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
		console.log(`Highest scoring student is :  Student ${highestStudent} scoring ${highestScore} \n`);
		console.log(`Lowest scoring student is :  Student ${lowestStudent}  scoring ${LowestScore}\n`);
		console.log(`Total score is: ${total} \nThe average score is: ${total / subjects} \n`);
		console.log("Number of passes %d%nNumber of fails %d%n", pass, fail);
		console.log("");
		}