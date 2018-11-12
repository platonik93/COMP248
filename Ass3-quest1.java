import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		String favorite;
		double gameOverallAvrg;
		int scoresMatch;
		int matchOverAvrg;
		int j = 0;
		int tournNmbr = 0;

		boolean favoriteAvail = false;
		String[] team16 = { "Uruguay", "Portugal", "France", "Argentina", "Brazil", "Mexico", "Belgium", "Japan",
				"Spain", "Russia", "Croatia", "Denmark", "Sweden", "Switzerland", "Colombia", "England" };
		int[] goals16 = new int[16];

		String[] team8 = new String[8];
		int[] goals8 = new int[8];

		String[] team4 = new String[4];
		int[] goals4 = new int[4];

		String[] finals = new String[2];
		int[] goalsFinal = new int[2];

		String winner = "";

		int[][] tournResults = new int[20][16];

		Scanner userInput = new Scanner(System.in);

		// USER FAVORITE TEAM USER INPUT

		System.out.println("Please enter your favorite team from one of the following list: \n" + team16.toString());

		favorite = userInput.nextLine();

		for (int x = 0; x < 16; x++) {

			if (favorite.equalsIgnoreCase(team16[x])) {

				favoriteAvail = true;

				// This is goal scored for each team in a match. We print it out for testing.
				// Goal can be from 0 to 4.
				// Once we have all the goals count for each teams we will then use these count
				// to determine which team
				// has won the match and transfer the team to the next round.

				// This is the limit of number of tournamenet
				for (tournNmbr = 0; tournNmbr <= 19; tournNmbr++) {
					j = 0;

					// This is goal scored for each team in a match. We print it out for testing.
					// Goal can be from 0 to 4.
					// Once we have all the goals count for each teams we will then use these count
					// to determine which team
					// has won the match and transfer the team to the next round.

					// THIS IS GOAL GENERATION FRO ROUND1
					for (int i = 0; i < goals16.length; i++) {

						goals16[i] = (int) (Math.random() * 5);

					}

					// ROUND 1 with 16 TEAMS
					// This is to determine which team scored more goals during the match and
					// depending on the outcome transfer them to the next array (team16 > team8 >
					// team4 > finals)

					System.out.print("ROUND OF 16");

					for (int i = 0; i < goals16.length; i += 2) {

						if (goals16[i] > goals16[i + 1]) {

							team8[j] = team16[i];

						}

						if (goals16[i] < goals16[i + 1]) {

							team8[j] = team16[i + 1];

						}

						while (goals16[i] == goals16[i + 1]) {

							// First overtime goal attempt for first team i
							goals16[i] = goals16[i] + (int) (Math.random() * 2);

							if (goals16[i] > goals16[i + 1]) {
								team8[j] = team16[i];
								break;
							}

							// Second overtime goal attempt for first team i+1
							goals16[i + 1] = goals16[i + 1] + (int) (Math.random() * 2);
							if (goals16[i] < goals16[i + 1]) {
								team8[j] = team16[i + 1];
								break;
							}

						}

						j++;

						// OFFICIAL PRINTOUT ROUND OF 16
						System.out.print("[" + team16[i] + " " + goals16[i] + ":" + goals16[i + 1] + " " + team16[i + 1]
								+ "]" + " ");

					}

					System.out.println("");

					// Testing printout for goals during game16 and tracking in 2D array
					for (int i = 0; i < team16.length; i++) {

						tournResults[tournNmbr][i] += goals16[i];

					}
					// Testing printout for team winners during the game16

					for (int i = 0; i < team8.length; i++) {

					}

					j = 0;

					System.out.print("QUARTER-FINALS");
					// GOAL GENERATION FOR ROUND with 8 TEAMS
					for (int i = 0; i < goals8.length; i++) {

						goals8[i] = (int) (Math.random() * 5);
					}

					// ROUND WITH 8 TEAMS
					// This is to determine which team scored more goals during the match and
					// depending on the outcome transfer them to the next array team8 >
					// team4 > finals)
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

						// OFFICIAL PRINTOUT ROUND OF 8
						System.out.print("[" + team8[i] + " " + goals8[i] + ":" + goals8[i + 1] + " " + team8[i + 1]
								+ "]" + " ");
					}
					System.out.println("");

					// Testing printout for goals during game16
					for (int i = 0; i < team8.length; i++) {

						tournResults[tournNmbr][i] += goals8[i];
					}
					// Testing printout for team winners during the game16

					for (int i = 0; i < team4.length; i++) {

					}

					j = 0;

					System.out.print("SEMI-FINALS");

					for (int i = 0; i < goals4.length; i++) {

						goals4[i] = (int) (Math.random() * 5);
					}

					// GAME with 4 TEAMS

					// This is to determine which team scored more goals during the match and
					// depending on the outcome transfer them to the next array team4 > finals)
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

						// OFFICIAL PRINTOUT ROUND OF 4
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

					System.out.println("\n\n");

					if (winner.equalsIgnoreCase(favorite)) {
						System.out.println("It took " + (tournNmbr + 1) + " tournaments (s) of the game for " + winner
								+ " to win!!!\n");
						break;
					}

				}

			}

		}

		if (favoriteAvail == true) {
			for (int z = 0; z < tournNmbr; z++) {
				System.out.print("[Tournament " + z + "] Total goals: [");
				
				for (int i = 0; i < 16; i++)
					System.out.print(tournResults[z][i] + ", ");
				
				System.out.print("] [Average: ");
				System.out.println("");
			}

		}

		if (favoriteAvail == false)
			System.out.print("Sorry please choose another team");

	}
}
