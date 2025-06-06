from datetime import date

def nextFlow(prevDay, prevMonth):
	#To calculate the next menstrual flow.
	todaysDate = date.today()
	print(todaysDate)
	return todaysDate




prevDay = int(input("Enter day of previous flow: "))
prevMonth = int(input("Enter month of previous flow: "))
flow_length = int(input("Enter length previous flow: "))
cycle_length = int(input("Enter length menstrual cycle: "))
print(nextFlow(prevDay, prevMonth))