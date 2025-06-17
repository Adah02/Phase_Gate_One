const prompt = require ("prompt-sync")()
const moment = require ('moment');

function nextFlowDate(monthOfFlow, dayOfFlow, flowLength, nextFlow){
	let year = 2025
	const date = new Date(year, monthOfFlow, dayOfFlow);
	year = date.getFullYear();
	let monthLength = date.getMonth().length;
	let month = date.getDay();
	let dayOfMonth = date.getDay();
	let remainingDaysOfMonth = monthLength - dayOfFlow;

	if (nextFlow > remainingDaysOfMonth){
		nextFlow -= remainingDaysOfMonth; monthOfFlow += 1;
	} else{
		nextFlow += dayOfFlow;
		}
	menstDate = Date(year, monthOfFlow, nextFlow);
	console.log("Next menstruation is", menstDate.toString())
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


