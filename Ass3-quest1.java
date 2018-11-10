import java.util.Scanner;

public class question1redo {

	public static void main(String[] args) {

		String favorite;
		double gameOverallAvrg;
		int scoresMatch;
		int matchOverAvrg;
		int j = 0;

		String[] team16 = { "Uruguay", "Portugal", "France", "Argentina", "Brazil", "Mexico", "Belgium", "Japan",
				"Spain", "Russia", "Croatia", "Denmark", "Sweden", "Switzerland", "Colombia", "England" };
		int[] goals16 = new int[16];

		String[] team8 = new String[8];
		int[] goals8 = new int[8];

		String[] team4 = new String[4];
		int[] goals4 = new int[4];

		String[] team2 = new String[4];
		int[] goals2 = new int[4];

		String[] finals = new String[2];
		int[] goalsFinal = new int[2];

		int[][] tournResults = new int[20][16];

		// This is goal scored for each team in a match. We print it out for testing.
		// Goal can be from 0 to 4.
		// Once we have all the goals count for each teams we will then use these count
		// to determine which team
		// has won the match and transfer the team to the next round.
		for (int i = 0; i < team16.length; i++) {

			goals16[i] = (int) (Math.random() * 5);
			System.out.print(team16[i] + "|");
			System.out.print(goals16[i] + "|");
		}

		System.out.println();

		// game16
		// This is to determine which team scored more goals during the match and
		// depending on the outcome transfer them to the next array (team16 > team8 >
		// team4 > finals)

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

				System.out.println("EVEN" + i);
			}

			j++;

		}

		// Testing printout for goals during game16
		for (int i = 0; i < team16.length; i++) {

			System.out.print(goals16[i] + "|");
		}
		// Testing printout for team winners during the game16
		System.out.println("");
		for (int i = 0; i < team8.length; i++) {

			System.out.print(team8[i] + "|");
		}

		j = 0;

		// Game8
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

				System.out.println("EVEN" + i);
			}

			j++;

		}

		// Testing printout for goals during game16
		for (int i = 0; i < team8.length; i++) {

			System.out.print(goals8[i] + "|");
		}
		// Testing printout for team winners during the game16
		System.out.println("");
		for (int i = 0; i < team4.length; i++) {

			System.out.print(team4[i] + "|");
		}

		j = 0;

		// Game4
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

				System.out.println("EVEN" + i);
			}

			j++;

		}

		// Testing printout for goals during game16
		for (int i = 0; i < team4.length; i++) {

			System.out.print(goals4[i] + "|");
		}
		// Testing printout for team winners during the game16
		System.out.println("");
		for (int i = 0; i < finals.length; i++) {

			System.out.print(finals[i] + "|");
		}
	}
}

/*
 * 
 * Scanner userInput = new Scanner(System.in);
 * 
 * System.out.println("Please enter your Favorite team: ");
 * 
 * favorite = userInput.next();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * for (int i = 0; i <= 15; i++) { // Loop for comparison of each array element
 * 
 * if (favorite.equalsIgnoreCase(teams16[i]))
 * 
 * { System.out.println("Hello" + Math.random() );
 * 
 * }
 * 
 * else { System.out.println("Please enter a team that is within the list.");
 * 
 * break; // break to the main future while loop }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */
