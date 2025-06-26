import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integer: ");
	int number = input.nextInt();
	
	int i = 1;
	for ( ; i <= number; i++){
	if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i){
		System.out.print(i);
		System.out.print(", ");
		}
	}
	}

}