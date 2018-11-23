import java.util.Scanner;

public class question1redo {

	public static void main(String[] args) {

		// Variable declatrations
		String favorite;
		double gameOverallAvrg = 0;
		int j = 0;
		int tournNmbr = 0;
		boolean favoriteAvail = false;
		String winner = "";

		// Arrays declaration and Scanner
		String[] team16 = { "Uruguay", "Portugal", "France", "Argentina", "Brazil", "Mexico", "Belgium", "Japan",
				"Spain", "Russia", "Croatia", "Denmark", "Sweden", "Switzerland", "Colombia", "England" };
		int[] goals16 = new int[16];

		String[] team8 = new String[8];
		int[] goals8 = new int[8];

		String[] team4 = new String[4];
		int[] goals4 = new int[4];

		String[] finals = new String[2];
		int[] goalsFinal = new int[2];

		int[][] tournResults = new int[20][16];

		Scanner userInput = new Scanner(System.in);

		System.out
				.println("WELCOME TO THE FIFA TOURNAEMENT SIUMLATION\n" + "=========================================");
		// USER FAVORITE TEAM USER INPUT
		System.out.print("[");
		for (int x = 0; x < team16.length; x++)
			System.out.print(team16[x] + ", ");
		System.out.print("]");
		System.out.print("\n\nPlease enter your favorite team from one of the above list: ");

		favorite = userInput.next();

		// Loop to run favorite against each string in team16 array.
		for (int x = 0; x < 16; x++) {

			// Check favorite is part of team16
			if (favorite.equalsIgnoreCase(team16[x])) {

				// variable that will be used for main routine validation
				favoriteAvail = true;

				// Main routine for 20 tournaments.
				for (tournNmbr = 0; tournNmbr <= 19; tournNmbr++) {
					j = 0;

					// Generating the goals for round16
					for (int i = 0; i < goals16.length; i++) {

						goals16[i] = (int) (Math.random() * 5);

					}

					// ROUND16 Winning team checks and advancement to Quarter-Finals

					System.out.print("ROUND OF 16");

					// Check if first team of pair won and advances it to Quarter-Finals
					for (int i = 0; i < goals16.length; i += 2) {

						if (goals16[i] > goals16[i + 1]) {

							team8[j] = team16[i];

						}
						// Check if second team of pair won and advances it to Quarter-Finals
						if (goals16[i] < goals16[i + 1]) {

							team8[j] = team16[i + 1];

						}
						// Check if even goals of pair and proceed to Sudden death

						while (goals16[i] == goals16[i + 1]) {

							// First overtime goal attempt for first team i recheck of winning team to
							// advance
							goals16[i] = goals16[i] + (int) (Math.random() * 2);

							if (goals16[i] > goals16[i + 1]) {
								team8[j] = team16[i];
								break;
							}

							// Second overtime goal attempt for first team i+1 and recheck of winning team
							// advance
							goals16[i + 1] = goals16[i + 1] + (int) (Math.random() * 2);
							if (goals16[i] < goals16[i + 1]) {
								team8[j] = team16[i + 1];
								break;
							}

						}

						// Incrementing the index of the array to which the winning teams will be
						// advanced to.
						j++;

						// Printing points for each pair
						System.out.print("[" + team16[i] + " " + goals16[i] + ":" + goals16[i + 1] + " " + team16[i + 1]
								+ "]" + " ");

					}

					System.out.println("");

					// Inserting the results of the round16 in the 2D array for later printout
					for (int i = 0; i < team16.length; i++) {

						tournResults[tournNmbr][i] += goals16[i];

					}

					// Reseting variable
					j = 0;

					// The following block of code does exactly the same as in Round16 games and is
					// re-used with different arrays.
					System.out.print("QUARTER-FINALS");

					// GOAL GENERATION FOR ROUND8
					for (int i = 0; i < goals8.length; i++) {

						goals8[i] = (int) (Math.random() * 5);
					}

					// ROUND WITH 8 TEAMS

					for (int i = 0; i < goals8.length; i += 2) {

						if (goals8[i] > goals8[i + 1]) {

							team4[j] = team8[i];

						}

						if (goals8[i] < goals8[i + 1]) {

							team4[j] = team8[i + 1];

						}

						while (goals8[i] == goals8[i + 1]) {

							// First overtime goal attempt for first team i
							goals8[i] = goals8[i] + (int) (Math.random() * 2);

							if (goals8[i] > goals8[i + 1]) {
								team4[j] = team8[i];
								break;
							}

							// Second overtime goal attempt for first team i+1
							goals8[i + 1] = goals8[i + 1] + (int) (Math.random() * 2);
							if (goals8[i] < goals8[i + 1]) {
								team4[j] = team8[i + 1];
								break;
							}

						}

						j++;

						// Printing points for each pair
						System.out.print("[" + team8[i] + " " + goals8[i] + ":" + goals8[i + 1] + " " + team8[i + 1]
								+ "]" + " ");
					}
					System.out.println("");

					for (int i = 0; i < team8.length; i++) {

						tournResults[tournNmbr][i] += goals8[i];
					}

					j = 0;

					// Round of SEMI-FINALS

					System.out.print("SEMI-FINALS");

					// GENERATION OF GOALS
					for (int i = 0; i < goals4.length; i++) {

						goals4[i] = (int) (Math.random() * 5);
					}

					// GAME with 4 TEAMS

					for (int i = 0; i < goals4.length; i += 2) {

						if (goals4[i] > goals4[i + 1]) {

							finals[j] = team4[i];

						}

						if (goals4[i] < goals4[i + 1]) {

							finals[j] = team4[i + 1];

						}

						while (goals4[i] == goals4[i + 1]) {

							// First overtime goal attempt for first team i
							goals4[i] = goals4[i] + (int) (Math.random() * 2);

							if (goals4[i] > goals4[i + 1]) {
								finals[j] = team4[i];
								break;
							}

							// Second overtime goal attempt for first team i+1
							goals4[i + 1] = goals4[i + 1] + (int) (Math.random() * 2);
							if (goals4[i] < goals4[i + 1]) {
								finals[j] = team4[i + 1];
								break;
							}

						}

						j++;

						// Printing points for each pair
						System.out.print("[" + team4[i] + " " + goals4[i] + ":" + goals4[i + 1] + " " + team4[i + 1]
								+ "]" + " ");
					}
					System.out.println("");

					// Testing printout for goals during the finals
					for (int i = 0; i < team4.length; i++) {

						// System.out.print(goals4[i] + "|");
						tournResults[tournNmbr][i] += goals4[i];
					}
					// Testing printout for team winners during the finals

					for (int i = 0; i < finals.length; i++) {

					}

					System.out.print("FINALS");

					for (int i = 0; i < goalsFinal.length; i++) {

						goalsFinal[i] = (int) (Math.random() * 5);

					}

					//// FINAL GAME with 2 TEAMS

					if (goalsFinal[0] > goalsFinal[1]) {

						winner = finals[0];

					}

					if (goalsFinal[0] < goalsFinal[1]) {

						winner = finals[1];

					}

					while (goalsFinal[0] == goalsFinal[1]) {

						// First overtime goal attempt for first team i
						goalsFinal[0] = goalsFinal[0] + (int) (Math.random() * 2);

						if (goalsFinal[0] > goalsFinal[1]) {
							winner = finals[0];
							break;
						}

						// Second overtime goal attempt for first team i+1
						goalsFinal[1] = goalsFinal[1] + (int) (Math.random() * 2);
						if (goalsFinal[0] < goalsFinal[1]) {
							winner = finals[1];
							break;
						}
					}

					// OFFICIAL PRINTOUT ROUND FINAL
					System.out
							.print("[" + finals[0] + " " + goalsFinal[0] + ":" + goalsFinal[1] + " " + finals[1] + "]");
					System.out.println("");

					// Testing printout for goals during game16
					for (int i = 0; i < finals.length; i++) {

						// System.out.print(goalsFinal[i] + "|");
						tournResults[tournNmbr][i] += goalsFinal[i];
					}
					// Testing printout for team winners during the game16

					System.out.print("Tournament: " + " " + tournNmbr + " The WINNER is: " + winner);

					System.out.println("\n");

					if (winner.equalsIgnoreCase(favorite)) {
						System.out.println("It took " + (tournNmbr + 1) + " tournaments (s) of the game for " + winner
								+ " to win!!!\n");
						break;
					}
					System.out.println("============================");
				}

			}

		}
		userInput.close();
		// Will do exit routine only we know that favoriteAvail is true and that we went
		// through our main routine
		// We printing out the game goals and the overall average for each tournament
		if (favoriteAvail == true) {
			for (int z = 0; z < tournNmbr; z++) {
				System.out.print("[Tournament " + z + "] Total goals: [");

				for (int i = 0; i < 16; i++)
					System.out.print(tournResults[z][i] + ", ");

				for (int x = 0; x < 16; x++) {
					int q = 0;
					q += (tournResults[z][x]);
					gameOverallAvrg = ((double) q / 16) * 20;

				}
				System.out.print("] [Average: " + gameOverallAvrg + "]");
				System.out.println("");
			}
			// Printing the average goals for all the played tournament and number of
			// matches above that said average
			System.out.println("\nAverage goals for " + tournNmbr + " tournament(s): " + gameOverallAvrg
					+ "\nTotal matches in all tournaments over the average goal value: " + (team16.length - tournNmbr));
		}

		// Print if the user has entered a team that does not exist
		if (favoriteAvail == false)
			System.out.print("\nSorry, your team is not playing in the FIFA World Cup!\n");

		System.out.print("\n================================\n" + "Thank you for trying the FIFA Simluator");
		System.exit(0);
	}
}
