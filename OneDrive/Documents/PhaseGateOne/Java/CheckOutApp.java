import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class CheckOutApp {

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
	int[] prices = {50000, 2500, 1600, 4500, 3750, 6000, 1500, 3000, 1000, 1900, 7400, 2500};

	ArrayList<String> purchasedproducts = new ArrayList<>();
	ArrayList<Integer> priceOfProducts = new ArrayList<>();

	System.out.println(availableProducts);
	boolean purchase = true;
	while (purchase == true){
	
	System.out.print("Enter product to purchase: ");
	int goods = input.nextInt();  
	purchasedproducts.add(products[goods - 1]);
	priceOfProducts.add(prices[goods - 1]);

	System.out.print("Enter quantity purchased: ");
	int quantity = input.nextInt(); 

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