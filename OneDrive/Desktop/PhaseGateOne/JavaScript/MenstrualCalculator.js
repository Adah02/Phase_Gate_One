const prompt = require ("prompt-sync")()
const moment = require ('moment');

function nextFlowDate(monthOfFlow, dayOfFlow, flowLength, nextFlow){
	const date = new Date();

	let year = date.getFullYear();
	let monthLength = new Date(year, monthOfFlow + 1, 0).getDate;
	let month = date.getMonth();
	let dayOfMonth = date.getDay();
	let remainingDaysInMonth = monthLength - dayOfFlow;

	if (nextFlow > remainingDaysInMonth){
		nextFlow -= remainingDaysInMonth; monthOfFlow += 1;
	} else{
		nextFlow += dayOfFlow;
		}
	menstDate = Date(year, monthOfFlow, nextFlow);
	console.log("Next menstruation is", monthLength.toLocaleDateString())
	return monthLength;
};

function ovulationPeriod(monthOfFlow, dayOfFlow){
	const menstDate = new Date(2025, monthOfFlow, dayOfFlow);
	let ovulation = dayOfFlow + 14;
	let daysLeft = menstDate.getMonth().length - dayOfFlow;
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


