import java.util.Scanner;


public class Question2 {
	
	public static void main(String[] args) {
		
		// declaring the values that will be used and initializing some which will be used inside loops
		int number;
		int remainder;
		int sum = 0;
		int divisor = 1 ;
		char retry = 'y';
		
		//First While looping checking for the intention of the user to retry another number is still at yes or in this case starts with 'y'
		while (retry == 'y') {
		
		//Resetting variables from past running instance values
		sum= 0;
		number = 0;
		divisor = 1;
		
		//Declaring our scanner
		Scanner userInput = new Scanner(System.in);
		
		//Asking for User input of number
		System.out.print("Enter a number with at most 7-digits: ");
		
		//number is assigned the userinput of an integer
		number = userInput.nextInt();
		
		System.out.println("");
		
		//retaining the original number value from userInput for future print
		int originalInput = number;
		
		//A function checking if the number entered by the user is no more than 7 digits by comparing it to the biggest 7 digits number
		if (number<=9999999) {
			
			//A loop that will add each remainder of the number starting by its last digits and then dividing by 10 in order to 
			//let go of the last digit (least significant digit) until all the remainders of the digits inside the number have been added to the sum.
			while(number>0) {
				//Calculating the remainder
				remainder = (number%10);
				// Adding those remainders together to the sum
				sum = sum + remainder;
				// Dividing number by 10 each time to omit last digit
				number = number/10;}
		
			//Priting out the original number and sum
		System.out.println("Sum of the digits of " + originalInput + " is: " + sum + "\n");
		
		//Printing out message for sum
		System.out.println("The divisors of " + sum + " are as follows:");
		
		// A loop to print all the divisors of the sum including the value of the sum itself <= sum
		//	Checking if the that the modulo of the sum by divisor (1) is exactly equal to 0 then printing out that divisor
		// and incrementing it by 1 each time the loop runs.
			while (divisor <= sum)
			{
				// Checking if if divisor is an actual divisor of sum
				if ((sum%divisor)==0)
					//printing out that divisor
					System.out.print(divisor + " " );
				//incrementation of divisor
				divisor++;
			}
			
		}
		
		
		// If the number is more than 7 digits
		else 
		System.out.println("Please enter a number with at most 7 digits only!");
		
		System.out.println("");
		
		System.out.println("Do you want to try another number? (yes to repeat no to stop)");
		
		retry = userInput.next().charAt(0);
		
		if (retry == 'n') {
			
			System.out.println("Thank you for using this calculator");
																		}
		
		
		
		}
		
		
		
		
		
	}
}
