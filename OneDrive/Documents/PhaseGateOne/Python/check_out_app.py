def sub_total(price_of_product, quantity_of_product):
	total_amount = 0
	for index in range(len(price_of_product)):
		total_amount += price_of_product[index] * quantity_of_product[index]

	return total_amount;

def tax_to_pay(price_of_product, quantity_of_product):
	#To calculate the total tax amount to be paid.
	total = 0
	for index in range(len(price_of_product)):
		total += price_of_product[index] * quantity_of_product[index]

	PERCENTAGE =100
	tax_percentage = 7.5

	tax_amount = (total / PERCENTAGE) * tax_percentage;
	return tax_amount;

def payment_amount(price_of_product, quantity_of_product):
	#To determine the total payment amount by customer
	
	total_amount = 0
	for index in range(len(price_of_product)):
		total_amount += price_of_product[index] * quantity_of_product[index]

	PERCENTAGE =100
	discount_percentage = 3.8
	tax_percentage = 7.5

	discount_amount = (total_amount / PERCENTAGE) * discount_percentage;
	tax_amount = (total_amount / PERCENTAGE) * tax_percentage;

	amount_to_pay = (tax_amount + total_amount) - discount_amount
	return amount_to_pay;

def purchase_discount(price_of_product, quantity_of_product):
	#To calculate discount for purchase amount.
	totalAmount = 0
	for index in range(len(price_of_product)):
		totalAmount += price_of_product[index] * quantity_of_product[index]

	PERCENTAGE =100
	discount_percentage = 3.8
	
	discount_amount = (totalAmount / PERCENTAGE) * discount_percentage;
	return discount_amount;

def customers_balance(bill, amount_paid):
	balance = amount_paid - bill

	return balance;

def header():
	headings = "		ITEM         QTY         PRICE         TOTAL"
	
	return headings

def lines():
	#Printing lines in receipt
	line = "=" * 55
	
	return line;


def store_details():
	#To hold store details
	StoreDetails = """
	SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
	TEL: 03293828343
	"""
	return StoreDetails;


products = []
price_of_product = []
quantity_of_product = []	

customers_name = str(input("Enter customer's name: "))

trade = True
while trade == True:
	product = input('\n Enter name of product: ')
	products.append(product )

	price = float(input("\n Enter price of product: "))
	price_of_product.append(price)

	product_count = int(input('\n How many did the customer buy? : '))
	quantity_of_product.append(product_count)
	
	users_choice = int(input('\n Would you like to add more? Press \"1\"  > Yes or \"0\" > No:'))

	if users_choice == 1:
		trade = True
	else:
		trade = False




amount_paid = input('\n How much did the customer pay: ')
cashiers_name = str(input("\n Enter cashier's name: "))

print(lines())
print(store_details())

print(customers_name)
print(cashiers_name)
print(lines())

print(payment_amount(price_of_product, quantity_of_product))
print(tax_to_pay(price_of_product, quantity_of_product))

