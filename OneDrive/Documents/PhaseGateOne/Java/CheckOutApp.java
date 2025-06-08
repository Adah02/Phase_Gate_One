import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApp {

	public static double[] productTotal (ArrayList<Double> productPrice, ArrayList<Double> productQuantity){
	
	double[] totalProductPrice = new double[productPrice.size()];

	for (int index = 0; index < productPrice.size(); index++){
		totalProductPrice[index] = (productPrice.get(index) * productQuantity.get(index));
		}
	return totalProductPrice;
	}

	public static double totalPurchaseAmount (ArrayList<Double> priceOfProducts){
	double total = 0;

	for (double price : priceOfProducts){
		total += price;
		}
	return total;
	}

	public static double valueAddedTax (ArrayList<Double> priceOfProducts){

	double total = 0;
	for (double price : priceOfProducts){
		total += price;
		}
	double taxPercentage = 7.5;
	final double PERCENTAGE = 100;
	double vat = (total / PERCENTAGE) * taxPercentage;
	
	return vat;
	}

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String availableProducts = 
"""
===================================
    Welcome to Semicolon Stores
===================================
    press the respective number
        to purchase product.
===================================
             Press:-
   1. Rice         2. Ice-Scream
   3. Bread        4. Yogurt
   5. Pringles     6. Vegetable-Oil
   7. Eggs         8. Mash-mallow
   9. Sadin        10. Bottle-water
  11. Peak Milk    12. Snackers
===================================
""";

	String[] products = {"Rice", "Ice-Scream", "Bread", "Yogurt", "Pringles", "Vegetable-Oil", "Eggs", "Mash-mallow", "Sadin", "Bottle-water", "Peak Milk", "Snackers"};
	double[] prices = {50000, 2500, 1600, 4500, 3750, 6000, 1500, 3000, 1000, 1900, 7400, 2500};

	ArrayList<String> purchasedproducts = new ArrayList<>();
	ArrayList<Double> productPrice = new ArrayList<>();
	ArrayList<Integer> productQuantity = new ArrayList<>();

	System.out.println(availableProducts);
	boolean purchase = true;
	while (purchase == true){
	
	System.out.print("Enter product to purchase: ");
	int goods = input.nextInt();  
	purchasedproducts.add(products[goods - 1]);

	System.out.print("How many pieces/bags? : ");
	int quantity = input.nextInt(); 
	productPrice.add(prices[goods - 1]);
	productQuantity.add(quantity);

		boolean proceedPurchase = true;
		while (proceedPurchase == true){
			System.out.print("Would you like to continue. Press \"1\" > Yes or \"0\" > No: ");
			int usersChoice = input.nextInt();
				
				if (usersChoice == 1){
					proceedPurchase = false;
				} else {
					proceedPurchase = false;
				}
			purchase = false;
			break;
			}
	
	}

	}
}