// -------------------------------------------------------
// Assignement 1
// For COMP 248 Section N - Fall 2018
// -------------------------------------------------------

/* This program prints my first name inside the console using BIG letters that are 
 * composed of other characters.
 */

// This is to import the library java.util library that contains the class Scanner that is used in Question 2.
import java.util.Scanner; 

//The program starts by calling the class
public class assignement1 {

	// We then call the main method.
	public static void main(String[] args) {

		/*  Question 1:
		 * test
		 * This function use the println method from the system.out class in order to print multiple strings 
		 * the are followed by new line. An /n escape character is used in each
		 * line to add a new line. After which all lines are added together to produce
		 * a graphic design in the same output of this println function. 
		 * 
		 * NOTE : This graphic was generated using an ASCII Art Generator found on the web; 
		 * http://patorjk.com/software/taag/#p=display&f=Doh&t=ALFRED
		*/
		System.out.println(
				"               AAA               LLLLLLLLLLL             FFFFFFFFFFFFFFFFFFFFFFRRRRRRRRRRRRRRRRR   EEEEEEEEEEEEEEEEEEEEEEDDDDDDDDDDDDD        \n" + 
				"              A:::A              L:::::::::L             F::::::::::::::::::::FR::::::::::::::::R  E::::::::::::::::::::ED::::::::::::DDD     \n" + 
				"             A:::::A             L:::::::::L             F::::::::::::::::::::FR::::::RRRRRR:::::R E::::::::::::::::::::ED:::::::::::::::DD   \n" + 
				"            A:::::::A            LL:::::::LL             FF::::::FFFFFFFFF::::FRR:::::R     R:::::REE::::::EEEEEEEEE::::EDDD:::::DDDDD:::::D  \n" + 
				"           A:::::::::A             L:::::L                 F:::::F       FFFFFF  R::::R     R:::::R  E:::::E       EEEEEE  D:::::D    D:::::D \n" + 
				"          A:::::A:::::A            L:::::L                 F:::::F               R::::R     R:::::R  E:::::E               D:::::D     D:::::D\n" + 
				"         A:::::A A:::::A           L:::::L                 F::::::FFFFFFFFFF     R::::RRRRRR:::::R   E::::::EEEEEEEEEE     D:::::D     D:::::D\n" + 
				"        A:::::A   A:::::A          L:::::L                 F:::::::::::::::F     R:::::::::::::RR    E:::::::::::::::E     D:::::D     D:::::D\n" + 
				"       A:::::A     A:::::A         L:::::L                 F:::::::::::::::F     R::::RRRRRR:::::R   E:::::::::::::::E     D:::::D     D:::::D\n" + 
				"      A:::::AAAAAAAAA:::::A        L:::::L                 F::::::FFFFFFFFFF     R::::R     R:::::R  E::::::EEEEEEEEEE     D:::::D     D:::::D\n" + 
				"     A:::::::::::::::::::::A       L:::::L                 F:::::F               R::::R     R:::::R  E:::::E               D:::::D     D:::::D\n" + 
				"    A:::::AAAAAAAAAAAAA:::::A      L:::::L         LLLLLL  F:::::F               R::::R     R:::::R  E:::::E       EEEEEE  D:::::D    D:::::D \n" + 
				"   A:::::A             A:::::A   LL:::::::LLLLLLLLL:::::LFF:::::::FF           RR:::::R     R:::::REE::::::EEEEEEEE:::::EDDD:::::DDDDD:::::D  \n" + 
				"  A:::::A               A:::::A  L::::::::::::::::::::::LF::::::::FF           R::::::R     R:::::RE::::::::::::::::::::ED:::::::::::::::DD   \n" + 
				" A:::::A                 A:::::A L::::::::::::::::::::::LF::::::::FF           R::::::R     R:::::RE::::::::::::::::::::ED::::::::::::DDD     \n" + 
				"AAAAAAA                   AAAAAAALLLLLLLLLLLLLLLLLLLLLLLLFFFFFFFFFFF           RRRRRRRR     RRRRRRREEEEEEEEEEEEEEEEEEEEEEDDDDDDDDDDDDD    ");
		
		
		
		
		/*Question 2 :
		 * 
		 */
		double mass; //This is the declaration of the mass floating point variable of the mass of the human
		double height; //This is the declaration of the height floating point variable of the height of the human
		double bmi; // This is the declaration of the BMI floating point variable of quotient of the mass and the square of height
		
		// We prompt the user to input his weight
		System.out.println("\n\nEnter your weight in kilograms:");
		
		// We declare the scanner object 
		Scanner userInput = new Scanner(System.in);
		
		//We declare height and intialized it with the user's input as a double
		mass = userInput.nextDouble();
		
		//String requesting height user input
		System.out.println("Enter your height in meters: ");
		
		//We declare height and intialized it with the user's input as a double
		height = userInput.nextDouble();
		
		//The main formula of BMI ; mass divided by the heigh^2
		bmi = mass/(height*height);
		
		//Printing out the user inputs and the value of bmi
		System.out.println("**************** BMI ****************\n\n"   +
				"Your weight:				" + mass + " KG"+ "\n" +
				"Your height:				" + height + " M" + "\n\n" +
				"Your BMI is:				" + bmi + "\n\n"
				);
		
		//Additional condition that prints a string if value of BMI is above 35
		if(bmi>35) System.out.println("Use coupon code COMP248 to get a 20% discount off your next Gym Membership at Fitness4Life\n\n");
		
		
		//Printing "Thank you" message
		System.out.println("**************** Thanks for using the BMI Calculator ****************");
		
	
		//Closing the scanner to avoid ressource leak
		userInput.close();
	}

}
