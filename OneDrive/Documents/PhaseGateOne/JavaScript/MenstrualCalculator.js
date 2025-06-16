const prompt = require ("prompt-sync")()

function nextFlowDate(monthOfFlow, dayOfFlow, flowLength, nextFlow){
	const menstDate = new Date(2025, monthOfFlow, dayOfFlow);
	let monthLength = menstDate.getMonth().length;
	let remainingDaysOfMonth = monthLength - dayOfFlow;

	if (nextFlow > remainingDaysOfMonth){
		nextFlow -= remainingDaysOfMonth; monthOfFlow += 1;
	} else{
		nextFlow += dayOfFlow;
		}
	menstDate = Date(2025, monthOfFlow, nextFlow);
	console.log("Next menstruation is", menstDate.toLocaleDateString())
	return monthLength;
};

function ovulationPeriod(monthOfFlow, dayOfFlow){
	const menstDate = new Date(2025, monthOfFlow, dayOfFlow);
	let ovulation = dayOfFlow + 14;
	let daysLeft = menstDate.lengthOfMonth - dayOfFlow;
	if (ovulation > daysLeft){
		ovulation = 14 - daysLeft;
		monthOfFlow += 1;
		console.log("Ovulation is due on ", ovulation , " of ", monthOfFlow)
		}
	return ovulation;
};


let monthOfFlow = prompt("Enter month of last flow: ")
let dayOfFlow = prompt("Enter day of last flow: ")
let flowLength = prompt("Enter length of last flow: ")
let nextFlow = prompt("Enter of days until next flow: ")

console.log(ovulationPeriod(monthOfFlow, dayOfFlow))
console.log(nextFlowDate(monthOfFlow, dayOfFlow, flowLength, nextFlow))


